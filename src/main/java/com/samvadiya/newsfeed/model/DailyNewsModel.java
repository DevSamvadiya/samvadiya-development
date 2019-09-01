package com.samvadiya.newsfeed.model;

/**
 * @author avenger
 */
public class DailyNewsModel {
    private String userId;
    private String dailyNewsId;
    private String dailyNews;
    private String image;
    private String support;
    private String newsTitle;
    private String createdIp;
    private String createdDate;

    /**
     * @return
     */
    public String getUserId() {
	return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
	this.userId = userId;
    }

    /**
     * @return
     */
    public String getDailyNewsId() {
	return dailyNewsId;
    }

    /**
     * @param dailyNewsId
     */
    public void setDailyNewsId(String dailyNewsId) {
	this.dailyNewsId = dailyNewsId;
    }

    /**
     * @return
     */
    public String getDailyNews() {
	return dailyNews;
    }

    /**
     * @param dailyNews
     */
    public void setDailyNews(String dailyNews) {
	this.dailyNews = dailyNews;
    }

    /**
     * @return
     */
    public String getImage() {
	return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
	this.image = image;
    }

    /**
     * @return
     */
    public String getSupport() {
	return support;
    }

    /**
     * @param support
     */
    public void setSupport(String support) {
	this.support = support;
    }

    /**
     * @return
     */
    public String getNewsTitle() {
	return newsTitle;
    }

    /**
     * @param newsTitle
     */
    public void setNewsTitle(String newsTitle) {
	this.newsTitle = newsTitle;
    }

    /**
     * @return
     */
    public String getCreatedIp() {
	return createdIp;
    }

    /**
     * @param createdIp
     */
    public void setCreatedIp(String createdIp) {
	this.createdIp = createdIp;
    }

    /**
     * @return createdDate
     */
    public String getCreatedDate() {
	return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
    }

}
