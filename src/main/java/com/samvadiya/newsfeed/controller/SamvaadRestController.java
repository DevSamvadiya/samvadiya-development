package com.samvadiya.newsfeed.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.samvadiya.newsfeed.dao.SamvaadDao;
import com.samvadiya.newsfeed.model.CommentModel;
import com.samvadiya.newsfeed.model.DailyNewsModel;
import com.samvadiya.newsfeed.model.SamvaadModel;
import com.samvadiya.newsfeed.model.FriendsActivityModel;

@RestController
@RequestMapping("/rest")
public class SamvaadRestController {
@Autowired public SamvaadDao samvaadDao;		
@RequestMapping("/getSamvaad")	
public @ResponseBody List<SamvaadModel> getSamvaad()
{
	List<SamvaadModel> list;
	try{
list=samvaadDao.getSamvaad("pankaj1234");
return list;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

return  null;

}


@RequestMapping("/getComment")	
public @ResponseBody Map<String,List<CommentModel>> getComment()
{
	System.out.println("I am rest controller");
	Map<String,List<CommentModel>> comment;
	try{
comment=samvaadDao.getComment("pankaj1234");
return comment;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

return  null;

}



@RequestMapping("/getFriendsActivity")	
public @ResponseBody List<FriendsActivityModel> getFriendsActivity()
{
	System.out.println("I am getFriendsActivity");
	List<FriendsActivityModel> friendsActivity;
	try{
		friendsActivity=samvaadDao.getFriendsActivity("pankaj1234");
return friendsActivity;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

return  null;

}



@RequestMapping("/getDailyNews")	
public @ResponseBody List<DailyNewsModel> getDailyNews()
{
	try{
		List<DailyNewsModel> dailyNews=samvaadDao.getDailyNews();
		
		System.out.println("I am getDailyNews "+dailyNews.size());
		
return dailyNews;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

return  null;

}


	

}
