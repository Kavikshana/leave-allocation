package com.example.leave.system.repositories;

import com.example.leave.system.entitites.LeaveAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveAllocationRepository extends JpaRepository<LeaveAllocation,Long> {
}
