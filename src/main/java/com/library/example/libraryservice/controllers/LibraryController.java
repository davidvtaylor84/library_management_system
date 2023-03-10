package com.library.example.libraryservice.controllers;

import com.library.example.libraryservice.models.Library;
import com.library.example.libraryservice.models.Staff;
import com.library.example.libraryservice.repositories.LibraryRepository;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LibraryController {

    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/library")
    public ResponseEntity<List<Library>> getLibrary(){
        return new ResponseEntity<>(libraryRepository.findAll(), HttpStatus.OK);
    }

}
