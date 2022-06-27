package com.example.demo.jspController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.jspRepository.UserCustom;

@Controller
@RequestMapping("/user/")
public class LoginController {
	
	@Autowired
	private UserCustom userService;
	
	@PostMapping("/login")
	public void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(userService.userLogin(email,password) != null) {
			System.out.print("Successful login!");
			response.sendRedirect("/recipe");
		}else {
			System.out.print("Wrong credentials");
			response.sendRedirect("/login");
		}
		
	}
}
