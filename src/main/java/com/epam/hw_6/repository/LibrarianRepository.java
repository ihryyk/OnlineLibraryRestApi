package com.epam.hw_6.repository;

import com.epam.hw_6.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<User, Long> {}
