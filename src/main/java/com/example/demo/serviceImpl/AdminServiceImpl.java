package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Book;
import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.repository.BookRepo;
import com.example.demo.repository.MessageRepo;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private MessageRepo messageRepo;
	
	@Autowired
	private BookRepo bookRepo;

	
	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public List<Message> getAllMessages() {
		return messageRepo.findAll();
	}

	@Override
	public void deleteUserByID(Long id) {
		userRepo.deleteById(id);
	}

	@Override
	public User getUserByID(Long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<Book> getAllAppointments() {
		return bookRepo.findAll();
	}

}
