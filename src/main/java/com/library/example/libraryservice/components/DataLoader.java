package com.library.example.libraryservice.components;

import com.library.example.libraryservice.repositories.BookRepository;
import com.library.example.libraryservice.repositories.LibraryRepository;
import com.library.example.libraryservice.repositories.MemberRepository;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibraryRepository libraryRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    StaffRepository staffRepository;

    public DataLoader(){};

    public void run(ApplicationArguments args){

    }

}
