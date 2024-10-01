package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;
import com.example.demo.model.DoctorDetails;


public interface DoctorDetiailsService {

	public DoctorDetails saveDetails(DoctorDetails doctorDetails);
	
	 List<DoctorDetails> getAllDetails();
	 
	 Book getappointmentByID(Long id);
}
