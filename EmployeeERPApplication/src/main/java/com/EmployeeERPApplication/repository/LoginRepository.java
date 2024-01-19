package com.EmployeeERPApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeERPApplication.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
