package com.example.leave.system.repositories;

import com.example.leave.system.entitites.LeaveDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveDetailsRepository extends JpaRepository<LeaveDetails,Long> {
}
