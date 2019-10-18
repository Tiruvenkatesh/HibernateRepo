package com.tiru.hibernateTest.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
	
	@ElementCollection
	private Set<Address2> AddressList = new HashSet<Address2>();
	
	
	public Set<Address2> getAddressList() {
		return AddressList;
	}
	public void setAddressList(Set<Address2> addressList) {
		AddressList = addressList;
	}
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
