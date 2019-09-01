package com.samvadiya.newsfeed.model;

/**
 * @author avenger
 *
 */
public class SamvaadModel {
    private String userId;
    private String imgUrl;
    private String profileImgUrl;
    private String samvaadId;
    private String samvaad;
    private String createddate;
    private String name;

    /**
     * @return
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return
     */
    public String getProfileImgUrl() {
	return profileImgUrl;
    }

    /**
     * @param profileImgUrl
     */
    public void setProfileImgUrl(String profileImgUrl) {
	this.profileImgUrl = profileImgUrl;
    }

    /**
     * @return
     */
    public String getImgUrl() {
	return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
    }

    /**
     * @return
     */
    public String getImgPos() {
	return imgPos;
    }

    /**
     * @param imgPos
     */
    public void setImgPos(String imgPos) {
	this.imgPos = imgPos;
    }

    private String imgPos;

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
    public String getSamvaadId() {
	return samvaadId;
    }

    /**
     * @param samvaadId
     */
    public void setSamvaadId(String samvaadId) {
	this.samvaadId = samvaadId;
    }

    /**
     * @return
     */
    public String getSamvaad() {
	return samvaad;
    }

    /**
     * @param samvaad
     */
    public void setSamvaad(String samvaad) {
	this.samvaad = samvaad;
    }

    /**
     * @return
     */
    public String getCreateddate() {
	return createddate;
    }

    /**
     * @param createddate
     */
    public void setCreateddate(String createddate) {
	this.createddate = createddate;
    }

}
