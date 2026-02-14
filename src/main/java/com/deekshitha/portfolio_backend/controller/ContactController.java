package com.deekshitha.portfolio_backend.controller;

import com.deekshitha.portfolio_backend.model.Contact;
import com.deekshitha.portfolio_backend.repository.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // Save contact
    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {
        Contact saved = contactRepository.save(contact);
        return ResponseEntity.ok(saved);
    }

    // Get all contacts (admin only)
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // Mark as contacted
    @PutMapping("/contacts/{id}")
    public ResponseEntity<Contact> markContacted(@PathVariable Long id) {
        return contactRepository.findById(id)
                .map(contact -> {
                    contact.setContacted(true);
                    contactRepository.save(contact);
                    return ResponseEntity.ok(contact);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
