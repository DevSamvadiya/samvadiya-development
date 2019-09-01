package com.samvadiya.security.domain;

/**
 * @author avenger
 *
 */
public class LoginDomain {
    private String email;
    private String userName;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;

    public String getEmail() {
	return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
	this.email = email;
    }

    public String getUserName() {
	return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
	this.password = password;
    }

    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getMiddleName() {
	return middleName;
    }

    /**
     * @param middleName
     */
    public void setMiddleName(String middleName) {
	this.middleName = middleName;
    }

    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

}
