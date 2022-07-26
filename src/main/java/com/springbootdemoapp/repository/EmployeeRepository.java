package com.springbootdemoapp.repository;

import com.springbootdemoapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Long, Employee> {

}
