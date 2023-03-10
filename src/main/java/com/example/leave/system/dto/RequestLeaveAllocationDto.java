package com.example.leave.system.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class RequestLeaveAllocationDto {
  private String employee_id;
  private String leaveType;
  private Date joinedDate;
}
