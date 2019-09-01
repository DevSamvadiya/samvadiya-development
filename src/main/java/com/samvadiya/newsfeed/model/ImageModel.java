package com.samvadiya.newsfeed.model;

/**
 * @author avenger
 *
 */
public class ImageModel {
    private String userId;
    private String imageUrl;
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
    public String getImageUrl() {
	return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
    }

    /**
     * @return
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
