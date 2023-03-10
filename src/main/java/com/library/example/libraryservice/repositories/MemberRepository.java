package com.library.example.libraryservice.repositories;

import com.library.example.libraryservice.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
