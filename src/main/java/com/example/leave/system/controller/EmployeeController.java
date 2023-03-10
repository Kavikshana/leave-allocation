package com.example.leave.system.controller;

import com.example.leave.system.dto.EmployeeDto;
import com.example.leave.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping("/add-employee")
  public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto){
    employeeService.addEmployee(employeeDto);
    return ResponseEntity.ok("Employee created");
  }

}
