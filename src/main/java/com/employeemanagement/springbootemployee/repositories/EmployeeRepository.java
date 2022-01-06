package com.employeemanagement.springbootemployee.repositories;

import com.employeemanagement.springbootemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
