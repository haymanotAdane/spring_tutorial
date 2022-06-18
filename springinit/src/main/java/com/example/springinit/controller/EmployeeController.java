package com.example.springinit.controller;

import com.example.springinit.entity.Employee;
import com.example.springinit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService empServ;

    @GetMapping()
    public ResponseEntity<List<Employee>> getCarName(){

        List<Employee> employees = empServ.getEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }

}
