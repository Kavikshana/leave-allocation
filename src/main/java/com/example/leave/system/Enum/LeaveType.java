package com.example.leave.system.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LeaveType {
  Annual("ANNUAL"),
  Casual("CASUAL"),
  Lieu("LIEU");
  private String leaveType;
}
