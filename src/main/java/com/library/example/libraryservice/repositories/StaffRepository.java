package com.library.example.libraryservice.repositories;

import com.library.example.libraryservice.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
