package com.example.leave.system.dto;

import com.example.leave.system.entitites.Employee;
import com.example.leave.system.entitites.LeaveAllocation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveDetailsDto {
  private Long id;
  private String leaveReason;
  private String leaveStatus;
  private int numOfRequestedLeaves;
  private Employee employee;
  private LeaveAllocation leaveAllocation;
}
