package com.example.leave.system.controller;

import com.example.leave.system.dto.RequestLeaveAllocationDto;
import com.example.leave.system.service.LeaveAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveAllocationController {
  @Autowired
  private LeaveAllocationService leaveAllocationService;
  @PostMapping("/leave-alloc")
  public ResponseEntity<Object> addLeaveAllocation(@RequestBody RequestLeaveAllocationDto requestLeaveAllocationDto){
    leaveAllocationService.addLieuLeave(requestLeaveAllocationDto);
    leaveAllocationService.addCasualLeave(requestLeaveAllocationDto);
    leaveAllocationService.addAnnualLeave(requestLeaveAllocationDto);
    return ResponseEntity.ok("Leave Allocation added Successfully");
  }
}
