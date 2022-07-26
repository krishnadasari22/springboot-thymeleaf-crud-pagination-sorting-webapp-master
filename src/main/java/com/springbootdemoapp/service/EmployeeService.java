package com.springbootdemoapp.service;

import com.springbootdemoapp.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Long> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Long> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
