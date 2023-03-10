package com.library.example.libraryservice.repositories;

import com.library.example.libraryservice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
