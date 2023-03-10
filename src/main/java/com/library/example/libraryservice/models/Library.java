package com.library.example.libraryservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="libraries")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties("library")
    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Member> membersList;

    @JsonIgnoreProperties("library")
    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Staff> staffList;

    @JsonIgnoreProperties("library")
    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> bookList;

    public Library() {
        this.membersList = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.bookList = new ArrayList<>();
    }

    public void addMember(Member member){
        membersList.add(member);
    }

    public void addStaff(Staff staff){
        staffList.add(staff);
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public Long getId() {
        return id;
    }

    public List<Member> getMembersList() {
        return membersList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
