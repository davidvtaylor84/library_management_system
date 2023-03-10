package com.library.example.libraryservice.controllers;

import com.library.example.libraryservice.models.Member;
import com.library.example.libraryservice.models.Staff;
import com.library.example.libraryservice.repositories.MemberRepository;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/members")
    public ResponseEntity<List<Member>> getMembers(){
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }

}
