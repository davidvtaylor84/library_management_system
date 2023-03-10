package com.library.example.libraryservice.models;

import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="isbn")
    private String isbn;

    @Column(name="genre")
    private String genre;

    @Column(name="publisher")
    private String publisher;

    @Column(name="yearPublished")
    private int publishedYear;

    @Column(name="checkedOut")
    private Boolean checkedOut;

    public Member getBorrowedBy() {
        return borrowedBy;
    }

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member borrowedBy;

    public Book() {
    }


    public Book(String title, String author, String isbn, String publisher, String genre, int publishedYear, Boolean checkedOut, Library library, Member borrowedBy) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.genre = genre;
        this.publishedYear = publishedYear;
        this.checkedOut = false;
        this.library = library;
        this.borrowedBy = borrowedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Boolean getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
