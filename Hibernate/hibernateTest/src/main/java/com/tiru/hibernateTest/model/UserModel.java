package com.tiru.hibernateTest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	
	
	@Id
	private int userID;
	@Column(name="User_name")
	private String userName;
	private Address homeaddress;
	@AttributeOverrides( { @AttributeOverride(name = "city" , column = @Column(name="work_city")) ,
						 @AttributeOverride(name = "State" , column = @Column(name="work_state"))}
			)
	private Address workaddress;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}
	public Address getWorkaddress() {
		return workaddress;
	}
	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}

	
	
	
}
