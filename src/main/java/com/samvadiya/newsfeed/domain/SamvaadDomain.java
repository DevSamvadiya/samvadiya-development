package com.samvadiya.newsfeed.domain;

import java.util.List;
import java.util.Map;

import com.samvadiya.newsfeed.model.CommentModel;
import com.samvadiya.newsfeed.model.ImageModel;
import com.samvadiya.newsfeed.model.SamvaadModel;

/**
 * @author avenger
 *
 */
public class SamvaadDomain {

    private List<CommentModel> comment;
    private List<SamvaadModel> samvaad;
    private List<ImageModel> profileImage;

    private Map<String, List<CommentModel>> displayComment;
    private Map<String, List<SamvaadModel>> displaySamvaad;
    private Map<String, List<ImageModel>> displayProfileImage;

    /**
     * @return
     */
    public List<ImageModel> getProfileImage() {
	return profileImage;
    }

    /**
     * @param profileImage
     */
    public void setProfileImage(List<ImageModel> profileImage) {
	this.profileImage = profileImage;
    }

    /**
     * @return
     */
    public Map<String, List<ImageModel>> getDisplayProfileImage() {
	return displayProfileImage;
    }

    /**
     * @param displayProfileImage
     */
    public void setDisplayProfileImage(Map<String, List<ImageModel>> displayProfileImage) {
	this.displayProfileImage = displayProfileImage;
    }

    /**
     * @return
     */
    public Map<String, List<CommentModel>> getDisplayComment() {
	return displayComment;
    }

    /**
     * @param displayComment
     */
    public void setDisplayComment(Map<String, List<CommentModel>> displayComment) {
	this.displayComment = displayComment;
    }

    /**
     * @return
     */
    public Map<String, List<SamvaadModel>> getDisplaySamvaad() {
	return displaySamvaad;
    }

    /**
     * @param displaySamvaad
     */
    public void setDisplaySamvaad(Map<String, List<SamvaadModel>> displaySamvaad) {
	this.displaySamvaad = displaySamvaad;
    }

    /**
     * @return
     */
    public List<CommentModel> getComment() {
	return comment;
    }

    /**
     * @param comment
     */
    public void setComment(List<CommentModel> comment) {
	this.comment = comment;
    }

    /**
     * @return
     */
    public List<SamvaadModel> getSamvaad() {
	return samvaad;
    }

    /**
     * @param samvaad
     */
    public void setSamvaad(List<SamvaadModel> samvaad) {
	this.samvaad = samvaad;
    }

}
