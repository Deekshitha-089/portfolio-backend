package com.deekshitha.portfolio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deekshitha.portfolio_backend.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
