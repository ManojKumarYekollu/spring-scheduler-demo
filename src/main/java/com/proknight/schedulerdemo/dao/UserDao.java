package com.proknight.schedulerdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proknight.schedulerdemo.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}
