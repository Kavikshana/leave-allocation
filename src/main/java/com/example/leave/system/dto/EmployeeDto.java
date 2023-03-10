package com.example.leave.system.dto;

import com.example.leave.system.entitites.Employee;
import com.example.leave.system.entitites.LeaveDetails;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class EmployeeDto {
  private String id;
  private String firstName;
  private String lastName;
  private Date joinedDate;
}
