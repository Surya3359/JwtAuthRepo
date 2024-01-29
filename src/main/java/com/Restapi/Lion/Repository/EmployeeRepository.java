package com.Restapi.Lion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restapi.Lion.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
