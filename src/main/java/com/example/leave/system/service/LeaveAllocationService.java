package com.example.leave.system.service;

import com.example.leave.system.dto.RequestLeaveAllocationDto;
import org.springframework.stereotype.Service;

@Service
public interface LeaveAllocationService {
  void addLieuLeave(RequestLeaveAllocationDto requestLeaveAllocationDto);
  void addCasualLeave(RequestLeaveAllocationDto requestLeaveAllocationDto);

  void addAnnualLeave(RequestLeaveAllocationDto requestLeaveAllocationDto);
}
