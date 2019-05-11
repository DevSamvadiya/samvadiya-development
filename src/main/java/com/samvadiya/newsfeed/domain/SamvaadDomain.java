package com.samvadiya.newsfeed.domain;

import java.util.List;
import java.util.Map;
import com.samvadiya.newsfeed.model.CommentModel;
import com.samvadiya.newsfeed.model.ImageModel;
import com.samvadiya.newsfeed.model.SamvaadModel;

public class SamvaadDomain {

	private List<CommentModel> comment;
	private List<SamvaadModel> samvaad;
	private List<ImageModel> profileImage;
	
	private Map<String,List<CommentModel>> displayComment;
	private Map<String,List<SamvaadModel>> displaySamvaad;
	private Map<String,List<ImageModel>> displayProfileImage;
	
	public List<ImageModel> getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(List<ImageModel> profileImage) {
		this.profileImage = profileImage;
	}
	public Map<String, List<ImageModel>> getDisplayProfileImage() {
		return displayProfileImage;
	}
	public void setDisplayProfileImage(Map<String, List<ImageModel>> displayProfileImage) {
		this.displayProfileImage = displayProfileImage;
	}
	public Map<String, List<CommentModel>> getDisplayComment() {
		return displayComment;
	}
	public void setDisplayComment(Map<String, List<CommentModel>> displayComment) {
		this.displayComment = displayComment;
	}
	public Map<String, List<SamvaadModel>> getDisplaySamvaad() {
		return displaySamvaad;
	}
	public void setDisplaySamvaad(Map<String, List<SamvaadModel>> displaySamvaad) {
		this.displaySamvaad = displaySamvaad;
	}
	
	
	public List<CommentModel> getComment() {
		return comment;
	}
	public void setComment(List<CommentModel> comment) {
		this.comment = comment;
	}
	public List<SamvaadModel> getSamvaad() {
		return samvaad;
	}
	public void setSamvaad(List<SamvaadModel> samvaad) {
		this.samvaad = samvaad;
	}
	
	
	
}
