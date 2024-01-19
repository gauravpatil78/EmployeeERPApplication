package com.EmployeeERPApplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeERPApplication.entity.Login;
import com.EmployeeERPApplication.repository.LoginRepository;
import com.EmployeeERPApplication.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public Login saveLoginDetails(Login login) {
		return loginRepo.save(login);
	}

	@Override
	public List<Login> getLoginDetails() {
		return loginRepo.findAll();
	}

}
