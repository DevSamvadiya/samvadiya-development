package com.samvadiya.newsfeed.model;

/**
 * @author avenger
 *
 */
/**
 * @author avenger
 *
 */
/**
 * @author avenger
 *
 */
public class CommentModel {
    private String userId;
    private String samvaadId;
    private String commentUserId;
    private String comment;
    private String commentDate;
    private String name;
    private String commentUserProfileImg;

    public String getCommentUserProfileImg() {
	return commentUserProfileImg;
    }

    /**
     * @param commentUserProfileImg
     */
    public void setCommentUserProfileImg(String commentUserProfileImg) {
	this.commentUserProfileImg = commentUserProfileImg;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

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

    public String getCommentUserId() {
	return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
	this.commentUserId = commentUserId;
    }

    public String getComment() {
	return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
	this.comment = comment;
    }

    public String getCommentDate() {
	return commentDate;
    }

    /**
     * @param commentDate
     */
    public void setCommentDate(String commentDate) {
	this.commentDate = commentDate;
    }

}
