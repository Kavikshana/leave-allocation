package com.example.leave.system.entitites;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class LeaveDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String leaveReason;
  private String leaveStatus;
  private int numOfRequestedLeaves;
  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
