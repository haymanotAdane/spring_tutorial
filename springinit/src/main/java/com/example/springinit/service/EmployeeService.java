package com.example.springinit.service;

import com.example.springinit.entity.Employee;
import com.example.springinit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getEmployees(){
        return empRepo.findAll();

    }
}
