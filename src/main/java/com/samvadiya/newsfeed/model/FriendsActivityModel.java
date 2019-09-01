package com.samvadiya.newsfeed.model;

public class FriendsActivityModel {
    private String name;
    private String samvaadUserId;
    private String samvaadId;
    private String remarks;
    private String createdDate;
    private String imgUrl;

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
    public String getSamvaadUserId() {
	return samvaadUserId;
    }

    /**
     * @param samvaadUserId
     */
    public void setSamvaadUserId(String samvaadUserId) {
	this.samvaadUserId = samvaadUserId;
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
    public String getRemarks() {
	return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
	this.remarks = remarks;
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

}
