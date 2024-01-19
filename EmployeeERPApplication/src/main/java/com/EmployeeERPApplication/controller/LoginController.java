package com.EmployeeERPApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeERPApplication.entity.Login;
import com.EmployeeERPApplication.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/login")
public class LoginController { 
	@Autowired
	private LoginService loginservice;
	
	@PostMapping("/SaveLogin")
	public Login saveLoginDate(@RequestBody Login login) {
		return loginservice.saveLoginDetails(login);	
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Login>> getLoginDetails() {
		return new ResponseEntity<List<Login>>(loginservice.getLoginDetails(),HttpStatus.OK);
	}
	
	
	
	
}
	


