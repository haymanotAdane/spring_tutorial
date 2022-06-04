package com.example.springinit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/cars")
    public ResponseEntity<List<String>> getCarName(){
        List<String>carName = new ArrayList<>();
        carName.add("Toyota");
        return new ResponseEntity<>(carName, HttpStatus.OK);

    }

}
