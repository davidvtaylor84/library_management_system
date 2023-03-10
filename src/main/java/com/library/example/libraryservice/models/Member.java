package com.library.example.libraryservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="firstname")
    private String firstName;
    @Column(name="surname")
    private String surname;

    @Column(name="DOB")
    private String DOB;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    @Column(name="idNumber")
    private String libraryID;

    @JsonIgnoreProperties("member")
    @OneToMany(mappedBy = "borrowedBy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> checkedOutBooks;

    @Column(name="notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "library_id", nullable = false)
    private Library library;

    public Member() {
    }


    public Member(String firstName, String surname, String DOB, String address, String email, String libraryID, String notes, Library library) {
        this.firstName = firstName;
        this.surname = surname;
        this.DOB = DOB;
        this.address = address;
        this.email = email;
        this.libraryID = libraryID;
        this.checkedOutBooks = new ArrayList<>();
        this.notes = notes;
        this.library = library;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

}
