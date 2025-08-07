package com.sarankirthic.task11.repository;

import com.sarankirthic.task11.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    List<Employee> findByEmployeeId(String employeeId);
    List<Employee> findByEmployeeEmail(String employeeEmail);
    List<Employee> findByLocation(String location);
}
