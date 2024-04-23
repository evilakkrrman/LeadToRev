package com.leadtorev.product_catalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadtorev.product_catalogue.dao.AddAvailability;
import com.leadtorev.product_catalogue.entity.Availability;
import com.leadtorev.product_catalogue.repository.AvailabilityRepository;

@Service
public class AvailabilityService {

	@Autowired
	private AvailabilityRepository availabilityRepository;
	
	public Availability createAvailability(AddAvailability addAvailability) {
		
	}
	
}
