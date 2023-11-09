package com.example.User_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User_Management.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
