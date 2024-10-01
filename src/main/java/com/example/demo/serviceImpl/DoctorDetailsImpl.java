package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.DoctorDetails;
import com.example.demo.repository.BookRepo;
import com.example.demo.repository.DoctorDetailsRepo;
import com.example.demo.service.DoctorDetiailsService;

@Service
public class DoctorDetailsImpl implements DoctorDetiailsService{
	
	@Autowired 
	private DoctorDetailsRepo detailsRepo;
	
	@Autowired 
	private BookRepo bookRepo;

	@Override
	public DoctorDetails saveDetails(DoctorDetails doctorDetails) {
		return detailsRepo.save(doctorDetails);
	}

	@Override
	public List<DoctorDetails> getAllDetails() {
		return detailsRepo.findAll();
	}

	@Override
	public Book getappointmentByID(Long id) {
		return bookRepo.findById(id).get();
	}
	
	public List<Book> getBooksForLoggedInDoctor(String dname) {
	    return bookRepo.findByDname(dname);
	}

}
