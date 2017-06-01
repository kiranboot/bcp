package com.example.kiran.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.kiran.address.Address;

@Entity
public class Business {

	@Id
	private String businessId;
	private String businessName;
	private String businessType;

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public Business() {
	}

	public Business(String businessId, String businessName, String businessType) {
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessType = businessType;
	}

}
