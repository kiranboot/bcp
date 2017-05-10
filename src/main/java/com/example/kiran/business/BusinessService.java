package com.example.kiran.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

	@Autowired
	private BusinessRepository businessRepository;

	public List<Business> getAllBusiness() {
		List<Business> businessList = new ArrayList<>();
		//businessRepository.findAll();
		businessRepository.findAll().forEach(businessList::add);
		return businessList;
	}

	public void addBusiness(Business business) {
		businessRepository.save(business);
	}
	
	public Business getBusiness(String id) {
		return businessRepository.findOne(id);
	}
	
	public void updateBusiness(String id, Business business) {
		 businessRepository.save(business);
	}

	public void deleteBusiness(String id) {
		 businessRepository.delete(id);
	}
}
