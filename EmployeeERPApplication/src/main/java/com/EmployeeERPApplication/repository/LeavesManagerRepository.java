package com.EmployeeERPApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeERPApplication.entity.LeavesManager;

@Repository
public interface LeavesManagerRepository extends JpaRepository<LeavesManager, Integer>{

}
