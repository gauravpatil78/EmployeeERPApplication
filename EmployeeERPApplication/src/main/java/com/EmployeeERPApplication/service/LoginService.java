package com.EmployeeERPApplication.service;

import java.util.List;

import com.EmployeeERPApplication.entity.Login;

public interface LoginService {
	
	public Login saveLoginDetails(Login login);
	
	public List<Login> getLoginDetails();

}
