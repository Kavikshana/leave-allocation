package com.example.leave.system.dto;

import com.example.leave.system.Enum.LeaveType;
import com.example.leave.system.entitites.Employee;
import com.example.leave.system.entitites.LeaveDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveAllocationDto {
  private Long id;
  private LeaveType leavetype;
  private int numOfAllocatedLeaves;
  private int availableLeaves;
  private int utilizedLeaves;
  private int pendingLeaves;
  private int approvedLeaves;
  private Employee employee;
  private LeaveDetails leaveDetails;
}
