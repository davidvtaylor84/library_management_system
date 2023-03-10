package com.library.example.libraryservice.controllers;

import com.library.example.libraryservice.models.Book;
import com.library.example.libraryservice.models.Staff;
import com.library.example.libraryservice.repositories.BookRepository;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getStaff(){
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
}
