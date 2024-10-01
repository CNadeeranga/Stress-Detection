package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;
import com.example.demo.model.Message;
import com.example.demo.model.User;

public interface AdminService {

	List<User> getAllUsers();

	List<Message> getAllMessages();

	void deleteUserByID(Long id);

	User getUserByID(Long id);

	User updateUser(User user);

	List<Book> getAllAppointments();

}
