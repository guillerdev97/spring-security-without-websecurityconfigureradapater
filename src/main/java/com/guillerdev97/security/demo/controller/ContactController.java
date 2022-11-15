package com.guillerdev97.security.demo.controller;

import com.guillerdev97.security.demo.model.Contact;
import com.guillerdev97.security.demo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;

    @GetMapping
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }
}
