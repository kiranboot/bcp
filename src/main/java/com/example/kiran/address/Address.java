package com.example.kiran.address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {


	@Id
	private String id;
	private String city;
	private String state;
	private String businessid;
	
	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public Address() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	


}
