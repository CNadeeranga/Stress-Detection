package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Message;



public interface MessageRepo extends JpaRepository<Message, Long>{

}
