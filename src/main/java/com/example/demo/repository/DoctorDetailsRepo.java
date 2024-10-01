package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DoctorDetails;

public interface DoctorDetailsRepo extends JpaRepository<DoctorDetails, Long>{
	public DoctorDetails findByEmail(String email);

}
