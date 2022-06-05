package com.example.springinit.controller;

import com.example.springinit.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping()
    public ResponseEntity<List<Employee>> getCarName(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abc"));
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }

}
