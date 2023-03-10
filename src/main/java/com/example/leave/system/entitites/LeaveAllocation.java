package com.example.leave.system.entitites;

import com.example.leave.system.Enum.LeaveType;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class LeaveAllocation{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LeaveType leaveType;
  private int numOfAllocatedLeaves;
  private int availableLeaves;
  private int utilizedLeaves;
  private int pendingLeaves;
  private int approvedLeaves;
  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
