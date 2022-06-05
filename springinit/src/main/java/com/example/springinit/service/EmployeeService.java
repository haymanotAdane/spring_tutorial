package com.example.springinit.service;

import com.example.springinit.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String getEmployee() {
        return "Employee-A";
    }
}
