package com.samvadiya.newsfeed.dao;

import java.util.List;
import java.util.Map;

import com.samvadiya.newsfeed.model.CommentModel;
import com.samvadiya.newsfeed.model.DailyNewsModel;
import com.samvadiya.newsfeed.model.FriendsActivityModel;
import com.samvadiya.newsfeed.model.SamvaadModel;

public interface SamvaadDao {
    final String GET_SAMVAAD = "GET_SAMVAAD";
    final String GET_COMMENT = "GET_COMMENT";
    final String GET_FRIENDS_ACTIVITY = "GET_FRIENDS_ACTIVITY";
    final String GET_DAILY_NEWS = "GET_DAILY_NEWS";

    /**
     * @param userId
     * @return
     * @throws Exception
     */
    public List<SamvaadModel> getSamvaad(String userId) throws Exception;

    /**
     * @param userId
     * @return
     * @throws Exception
     */
    public Map<String, List<CommentModel>> getComment(String userId) throws Exception;

    /**
     * @param userId
     * @return
     * @throws Exception
     */
    /**
     * @param userId
     * @return
     * @throws Exception
     */
    public List<FriendsActivityModel> getFriendsActivity(String userId) throws Exception;

    /**
     * @return
     * @throws Exception
     */
    public List<DailyNewsModel> getDailyNews() throws Exception;
}
