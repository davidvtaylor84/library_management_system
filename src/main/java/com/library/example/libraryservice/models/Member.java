package com.library.example.libraryservice.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;
    private String DOB;
    private String address;
    private String email;
    private String libraryID;
    private ArrayList<Book> checkedOutBooks;
    private ArrayList<Book> borrowHistory;
    private ArrayList<Book> booksOnHold;

    @ManyToOne
    @JoinColumn(name = "library_id", nullable = false)
    private Library library;

    public Member() {
    }

    public Member(String firstName, String surname, String DOB, String address, String email, String libraryID, Library library) {
        this.firstName = firstName;
        this.surname = surname;
        this.DOB = DOB;
        this.address = address;
        this.email = email;
        this.libraryID = libraryID;
        this.checkedOutBooks = new ArrayList<>();
        this.borrowHistory = new ArrayList<>();
        this.booksOnHold = new ArrayList<>();
        this.library = library;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(ArrayList<Book> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    public ArrayList<Book> getBorrowHistory() {
        return borrowHistory;
    }

    public void setBorrowHistory(ArrayList<Book> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public ArrayList<Book> getBooksOnHold() {
        return booksOnHold;
    }

    public void setBooksOnHold(ArrayList<Book> booksOnHold) {
        this.booksOnHold = booksOnHold;
    }
}
