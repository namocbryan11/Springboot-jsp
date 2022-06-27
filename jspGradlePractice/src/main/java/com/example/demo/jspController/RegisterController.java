package com.example.demo.jspController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.jspModel.User;
import com.example.demo.jspRepository.UserCustom;

@Controller
@RequestMapping("/user/")
public class RegisterController {
	
	@Autowired
	private UserCustom userCustom;
	
	@PostMapping("/register")
	public void registerUser (HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		System.out.print(user.getEmail());
		System.out.print(userCustom.findUserByEmail(user.getEmail()));
		if(userCustom.findUserByEmail(user.getEmail()) == null) {
			userCustom.registerUser(user);
			response.sendRedirect("/recipes");
		}else {
			System.out.print("Email is already taken!");
			response.sendRedirect("/registration");
		}
		
	}
}
