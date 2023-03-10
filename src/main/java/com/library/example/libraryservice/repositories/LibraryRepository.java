package com.library.example.libraryservice.repositories;

import com.library.example.libraryservice.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
