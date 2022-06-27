package com.example.demo.jspModel;

import javax.persistence.*;

@Entity
@Table(name="JSP_USER")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="firstname")
	private String fristname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="password")
	private String password;

	public User() {
		super();
	}

	public User(Long id, String email, String fristname, String lastname, String password) {
		super();
		Id = id;
		this.email = email;
		this.fristname = fristname;
		this.lastname = lastname;
		this.password = password;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
