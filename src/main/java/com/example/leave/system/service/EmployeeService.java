package com.example.leave.system.service;

import com.example.leave.system.dto.EmployeeDto;
import com.example.leave.system.entitites.Employee;
import org.springframework.stereotype.Service;

public interface EmployeeService {
  void addEmployee(EmployeeDto employeeDto);
}
