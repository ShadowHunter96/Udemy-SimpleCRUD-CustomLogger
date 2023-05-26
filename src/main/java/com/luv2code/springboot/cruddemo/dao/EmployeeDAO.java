package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findByID(int theId);
    Employee save(Employee employee);

    void deleteByID(int theId);


}
