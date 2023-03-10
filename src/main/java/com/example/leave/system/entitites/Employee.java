package com.example.leave.system.entitites;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Employee {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private Date joinedDate;
  @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private List<LeaveDetails> leaveDetails;
  @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private List<LeaveAllocation> leaveAllocation;
}
