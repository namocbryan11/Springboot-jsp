package com.example.demo.jspRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.jspModel.User;

@Repository
public interface UserCustom {
	public void registerUser(User user);
	public User findUserByEmail(String email);
	public User userLogin(String email, String password);
}
