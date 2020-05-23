package com.gipher.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {

    /*
	 * This class should have five fields (userId,firstName,lastName,
	 * userPassword,userRole,userAddedDate). Out of these five fields, the field
	 * userId should be the primary key. This class should also contain the getters
	 * and setters for the fields, along with the no-arg , parameterized constructor
	 * and toString method.The value of userAddedDate should not be accepted from
	 * the user but should be always initialized with the system date
	 */
	

    @Id
    private String userId;
    private String userPassword;
    private String firstName;
    private String lastName;
    private String userRole;
    private String image;
    private Date userAddedDate;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getUserAddedDate() {
		return userAddedDate;
	}
	public void setUserAddedDate(Date userAddedDate) {
		this.userAddedDate = userAddedDate;
	}
	
   
}
