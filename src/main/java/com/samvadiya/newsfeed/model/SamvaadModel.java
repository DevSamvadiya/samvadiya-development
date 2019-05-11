package com.samvadiya.newsfeed.model;

public class SamvaadModel {
	private String userId;
	private String imgUrl;
	private String profileImgUrl;
	private String samvaadId;
	private String samvaad;
	private String createddate;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfileImgUrl() {
		return profileImgUrl;
	}
	public void setProfileImgUrl(String profileImgUrl) {
		this.profileImgUrl = profileImgUrl;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgPos() {
		return imgPos;
	}
	public void setImgPos(String imgPos) {
		this.imgPos = imgPos;
	}
	private String imgPos;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSamvaadId() {
		return samvaadId;
	}
	public void setSamvaadId(String samvaadId) {
		this.samvaadId = samvaadId;
	}
	public String getSamvaad() {
		return samvaad;
	}
	public void setSamvaad(String samvaad) {
		this.samvaad = samvaad;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	
	
}
