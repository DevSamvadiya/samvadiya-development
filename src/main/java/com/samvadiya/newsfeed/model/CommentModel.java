package com.samvadiya.newsfeed.model;

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

    /**
     * @return
     */
    public String getCommentUserProfileImg() {
	return commentUserProfileImg;
    }

    /**
     * @param commentUserProfileImg
     */
    public void setCommentUserProfileImg(String commentUserProfileImg) {
	this.commentUserProfileImg = commentUserProfileImg;
    }

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
    public String getCommentUserId() {
	return commentUserId;
    }

    /**
     * @param commentUserId
     */
    public void setCommentUserId(String commentUserId) {
	this.commentUserId = commentUserId;
    }

    /**
     * @return
     */
    public String getComment() {
	return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
	this.comment = comment;
    }

    /**
     * @return
     */
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
