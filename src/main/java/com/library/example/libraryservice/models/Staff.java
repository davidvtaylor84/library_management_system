package com.library.example.libraryservice.models;

import jakarta.persistence.*;

@Entity
@Table(name="staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="firstname")
    private String staffFirstName;

    @Column(name="surname")
    private String staffSurname;

    @Column(name="staffID")
    private String staffID;

    @Column(name="staffPassword")
    private String staffPassword;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public Staff() {
    }

    public Staff(String staffFirstName, String staffSurname, String staffID, String staffPassword, Library library) {
        this.staffFirstName = staffFirstName;
        this.staffSurname = staffSurname;
        this.staffID = staffID;
        this.staffPassword = staffPassword;
        this.library = library;
    }

    public String getStaffFirstName() {
        return staffFirstName;
    }

    public void setStaffFirstName(String staffFirstName) {
        this.staffFirstName = staffFirstName;
    }

    public String getStaffSurname() {
        return staffSurname;
    }

    public void setStaffSurname(String staffSurname) {
        this.staffSurname = staffSurname;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }
}
