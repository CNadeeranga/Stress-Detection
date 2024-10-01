package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;
import com.example.demo.model.DoctorDetails;
import com.example.demo.model.Message;
import com.example.demo.model.User;

public interface UserService {
	public User saveUser(User user);

	public void removeSessionMessage();

	public Message saveMessages(Message message);

	List<DoctorDetails> getAllDoctors();

	DoctorDetails getDoctorDetailsByID(Long id);
	
	public Book saveBook(Book book);
}
