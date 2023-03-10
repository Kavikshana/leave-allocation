package com.example.leave.system.service;

import com.example.leave.system.dto.EmployeeDto;
import com.example.leave.system.dto.LeaveAllocationDto;
import com.example.leave.system.entitites.Employee;
import com.example.leave.system.entitites.LeaveAllocation;
import com.example.leave.system.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
  @Autowired
  private EmployeeRepository employeeRepository;
  @Override
  public void addEmployee(EmployeeDto employeeDto) {
    Employee employee = new Employee();
    employee.setId(employeeDto.getId());
    employee.setJoinedDate(employeeDto.getJoinedDate());
    employee.setFirstName(employeeDto.getFirstName());
    employee.setLastName(employeeDto.getLastName());
    employeeRepository.save(employee);
  }
}
