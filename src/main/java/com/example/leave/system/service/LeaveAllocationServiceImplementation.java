package com.example.leave.system.service;

import com.example.leave.system.Enum.LeaveType;
import com.example.leave.system.dto.RequestLeaveAllocationDto;
import com.example.leave.system.entitites.Employee;
import com.example.leave.system.entitites.LeaveAllocation;
import com.example.leave.system.repositories.LeaveAllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveAllocationServiceImplementation implements LeaveAllocationService {
  @Autowired
  private LeaveAllocationRepository leaveAllocationRepository;
  @Override
  public void addLieuLeave(RequestLeaveAllocationDto requestLeaveAllocationDto) {
    LeaveAllocation leaveAllocation = new LeaveAllocation();
    Employee employee = new Employee();
    employee.setId(requestLeaveAllocationDto.getEmployee_id());
    leaveAllocation.setEmployee(employee);
    leaveAllocation.setLeaveType(LeaveType.Lieu);
    leaveAllocation.setAvailableLeaves(0);
    leaveAllocation.setPendingLeaves(0);
    leaveAllocation.setApprovedLeaves(0);
    leaveAllocation.setUtilizedLeaves(0);
    leaveAllocation.setNumOfAllocatedLeaves(0);
    leaveAllocationRepository.save(leaveAllocation);
  }
  public void addCasualLeave(RequestLeaveAllocationDto requestLeaveAllocationDto){
    LeaveAllocation leaveAllocation = new LeaveAllocation();
    Employee employee = new Employee();
    employee.setId(requestLeaveAllocationDto.getEmployee_id());
    leaveAllocation.setEmployee(employee);
    leaveAllocation.setLeaveType(LeaveType.Casual);
    leaveAllocation.setAvailableLeaves(0);
    leaveAllocation.setPendingLeaves(0);
    leaveAllocation.setApprovedLeaves(0);
    leaveAllocation.setUtilizedLeaves(0);
    leaveAllocation.setNumOfAllocatedLeaves(0);
    leaveAllocationRepository.save(leaveAllocation);
  }

  public void addAnnualLeave(RequestLeaveAllocationDto requestLeaveAllocationDto){
    LeaveAllocation leaveAllocation = new LeaveAllocation();
    Employee employee = new Employee();
    employee.setId(requestLeaveAllocationDto.getEmployee_id());
    leaveAllocation.setEmployee(employee);
    leaveAllocation.setLeaveType(LeaveType.Annual);
    leaveAllocation.setAvailableLeaves(0);
    leaveAllocation.setPendingLeaves(0);
    leaveAllocation.setApprovedLeaves(0);
    leaveAllocation.setUtilizedLeaves(0);
    leaveAllocation.setNumOfAllocatedLeaves(0);
    leaveAllocationRepository.save(leaveAllocation);
  }
}
