package com.samvadiya.newsfeed.daoimpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.samvadiya.newsfeed.dao.SamvaadDao;
import com.samvadiya.newsfeed.model.CommentModel;
import com.samvadiya.newsfeed.model.DailyNewsModel;
import com.samvadiya.newsfeed.model.FriendsActivityModel;
import com.samvadiya.newsfeed.model.SamvaadModel;
import com.samvadiya.persistance.util.ProcedureBuilder;
import com.samvadiya.persistance.util.StoreProcParameters;

@Component
public class SamvaadDaoImpl implements SamvaadDao {
@Autowired private DataSource dataSource;	
private JdbcTemplate jdbcTemplate;
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<SamvaadModel> getSamvaad(String userId) throws Exception {
	jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(this.dataSource);
	if(jdbcTemplate.getDataSource()==null) throw new Exception("Data Source Not Available");
	
	List<StoreProcParameters> sqlResultParameters = new ArrayList<>();
	List<StoreProcParameters> sqlInParameters = new ArrayList<>();
    List<StoreProcParameters> sqlOutParameters = new ArrayList<>();
	sqlResultParameters.add(new StoreProcParameters("SAMVAAD_LIST", null, Types.REF_CURSOR, new SamvaadMapper()));
	sqlInParameters.add(new StoreProcParameters("IN_USER_ID", userId, Types.VARCHAR, null));
	sqlOutParameters.add(new StoreProcParameters("OUT_STATUS_CODE",null,Types.INTEGER,null));
    ProcedureBuilder proc = new ProcedureBuilder(jdbcTemplate.getDataSource(), GET_SAMVAAD, sqlInParameters, sqlOutParameters,sqlResultParameters);
    Map<String,CommentModel> data =proc.execute(sqlInParameters);
	
	List<SamvaadModel> list=(List)data.get("SAMVAAD_LIST");
	
    System.out.println("List Samvaad "+list.size());
	return list;
	}
	
	
	 private static final class SamvaadMapper implements RowMapper<Object> {
            @Override
	        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	            System.out.println("Mapper class invoked...");
	            SamvaadModel sd=new SamvaadModel();
                sd.setUserId(rs.getString("USER_ID"));
                sd.setSamvaadId(rs.getString("SAMVAAD_ID"));
                sd.setSamvaad(rs.getString("SAMVAAD"));
                sd.setName(rs.getString("NAME"));
                sd.setCreateddate(rs.getString("CREATED_DATE"));
                sd.setImgUrl(rs.getString("IMGURL"));
                sd.setImgPos(rs.getString("F_STATUS"));
                sd.setProfileImgUrl(rs.getString("PROFILE_IMAGE"));
	            return sd;
	        }
	    }
	 
	 
	 @Override
		public Map<String,List<CommentModel>> getComment(String userId) throws Exception {
		 jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(this.dataSource);
		 if(jdbcTemplate.getDataSource()==null) throw new Exception("Data Source Not Available");
		 List<StoreProcParameters> sqlResultParameters = new ArrayList<>();
		 List<StoreProcParameters> sqlInParameters = new ArrayList<>();
         List<StoreProcParameters> sqlOutParameters = new ArrayList<>();
         
         StoreProcParameters storeParametersMain = new StoreProcParameters("IN_USER_ID", userId,Types.VARCHAR, null);
         sqlInParameters.add(storeParametersMain);
         
         storeParametersMain = new StoreProcParameters("OUT_TOTAL_LIKE", null, Types.INTEGER, null);
         sqlOutParameters.add(storeParametersMain);
         
         storeParametersMain=new StoreProcParameters("RESULT_LIST", null, Types.REF_CURSOR, new CommentMapper());
         sqlResultParameters.add(storeParametersMain);
         
         ProcedureBuilder proc = new ProcedureBuilder(jdbcTemplate.getDataSource(), GET_COMMENT, sqlInParameters, sqlOutParameters,sqlResultParameters);
         @SuppressWarnings("unchecked")
		 Map<String,CommentModel> data =proc.execute(sqlInParameters);
         System.out.println("Status Code==="+data.get("OUT_TOTAL_LIKE"));
         
         @SuppressWarnings("unchecked")
		 List<CommentModel> list=(List<CommentModel>)data.get("RESULT_LIST");
         
		 Map<String, List<CommentModel>> result=list.stream().collect(Collectors.groupingBy(x->(x.getUserId()+x.getSamvaadId())));
		 System.out.println("total comment "+result.size());
		 return result;
		}
	 
	 private static final class CommentMapper implements RowMapper<Object> {
         @Override
	     public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	            CommentModel commentModel=new CommentModel();
	            commentModel.setUserId(rs.getString("USER_ID"));
	            commentModel.setSamvaadId(rs.getString("SAMVAAD_ID"));
	            commentModel.setCommentUserId(rs.getString("COMMENT_ID"));
	            commentModel.setComment(rs.getString("S_COMMENT"));
	            commentModel.setCommentDate(rs.getString("CREATED_TIME"));
	            commentModel.setName(rs.getString("NAME"));
	            commentModel.setCommentUserProfileImg(rs.getString("IMGURL"));
	            return commentModel;
	        }
	    }


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<FriendsActivityModel> getFriendsActivity(String userId) throws Exception {
		jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(this.dataSource);
		 if(jdbcTemplate.getDataSource()==null) throw new Exception("Data Source Not Available");
		 List<StoreProcParameters> sqlResultParameters = new ArrayList<>();
		 List<StoreProcParameters> sqlInParameters = new ArrayList<>();
         List<StoreProcParameters> sqlOutParameters = new ArrayList<>();
		
         sqlResultParameters.add(new StoreProcParameters("FRIEND_ACTIVITY_LIST", null, Types.REF_CURSOR, new FriendsActivityMapper()));
     	 sqlInParameters.add(new StoreProcParameters("IN_USER_ID", userId, Types.VARCHAR, null));
     	 sqlOutParameters.add(new StoreProcParameters("OUT_STATUS",null,Types.INTEGER,null));
         ProcedureBuilder proc = new ProcedureBuilder(jdbcTemplate.getDataSource(), GET_FRIENDS_ACTIVITY, sqlInParameters, sqlOutParameters,sqlResultParameters);
         Map<String,CommentModel> data =proc.execute(sqlInParameters);
     	
     	 List<FriendsActivityModel> list=(List)data.get("FRIEND_ACTIVITY_LIST");
		 System.out.println("getFriendsActivity  == "+list.size());
		return list;
	}
	
	
	 private static final class FriendsActivityMapper implements RowMapper<Object> {
         @Override
	     public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        	 FriendsActivityModel fam=new FriendsActivityModel();
        	 fam.setName(rs.getString("NAME"));
        	 fam.setSamvaadUserId(rs.getString("SAMVAAD_USER_ID"));
        	 fam.setSamvaadId(rs.getString("SAMVAAD_ID"));
        	 fam.setRemarks(rs.getString("REMARKS"));
        	 fam.setImgUrl(rs.getString("IMGURL"));
        	 fam.setCreatedDate(rs.getString("CREATED_DATE"));
        	 return fam;
	        }
	    }
	 
	 
	 
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	public List<DailyNewsModel> getDailyNews() throws Exception
	 {
		 jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(this.dataSource);
		 if(jdbcTemplate.getDataSource()==null) throw new Exception("Data Source Not Available");
		 List<StoreProcParameters> sqlResultParameters = new ArrayList<>();
		 List<StoreProcParameters> sqlInParameters = new ArrayList<>();
         List<StoreProcParameters> sqlOutParameters = new ArrayList<>();
         
         
         sqlResultParameters.add(new StoreProcParameters("DAILY_NEWS", null, Types.REF_CURSOR, new DailyNewsMapper()));
     	 ProcedureBuilder proc = new ProcedureBuilder(jdbcTemplate.getDataSource(), GET_DAILY_NEWS, sqlInParameters, sqlOutParameters,sqlResultParameters);
         Map<String,DailyNewsModel> data =proc.execute(sqlInParameters);
     	
     	 List<DailyNewsModel> list=(List)data.get("DAILY_NEWS");
		 System.out.println("DAILY_NEWS  == "+list.size());
		 
		 
		 
		 return list;
	 }


	 private static final class DailyNewsMapper implements RowMapper<Object> {
         @Override
	     public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        	 DailyNewsModel dailyNews=new DailyNewsModel();
        	 dailyNews.setUserId(rs.getString("USER_ID"));
        	 dailyNews.setDailyNewsId(rs.getString("DAILY_NEWS_ID"));
        	 dailyNews.setDailyNews(rs.getString("DAILY_NEWS"));
        	 dailyNews.setImage(rs.getString("IMAGE"));
        	 dailyNews.setNewsTitle(rs.getString("NEWS_TITLE"));
        	 dailyNews.setSupport(rs.getString("SUPPORT"));
        	 dailyNews.setCreatedIp(rs.getString("CREATED_IP"));
        	 dailyNews.setCreatedDate(rs.getString("CREATED_DATE"));
        	 
        	 return dailyNews;
	        }
	    }

}
