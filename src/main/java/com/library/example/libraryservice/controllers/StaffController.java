package com.library.example.libraryservice.controllers;

import com.library.example.libraryservice.models.Staff;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @GetMapping("/staffmembers")
    public ResponseEntity<List<Staff>> getStaff(){
        return new ResponseEntity<>(staffRepository.findAll(), HttpStatus.OK);
    }

}
