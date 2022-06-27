package com.example.demo.jspRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.jspModel.User;

@Repository
public class UserImpl implements UserCustom {
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void registerUser(User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		String sql = "INSERT INTO JSP_USERS(EMAIL,PASSWORD) VALUES (?,?)";
		try {
			jdbcTemplate.update(sql,email,password);
			System.out.print("User Successfully Saved!");
		}catch(Exception ex) {
			System.out.print(ex.getMessage().toString());
		}		
	}

	@Override
	public User findUserByEmail(String email) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM JSP_USERS WHERE EMAIL = ? FETCH FIRST 1 ROWS ONLY", BeanPropertyRowMapper.newInstance(User.class), email);
		}catch(Exception ex) {
			System.out.print("User does not exist!");
			return null;
		}	
	}

	@Override
	public User userLogin(String email, String password) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM JSP_USERS WHERE EMAIL = ? and PASSWORD = ? FETCH FIRST 1 ROWS ONLY", BeanPropertyRowMapper.newInstance(User.class), email,password);
		}catch(Exception ex) {
			System.out.print("User not exist!");
			return null;
		}	
	}
}
