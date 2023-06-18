package com.contactapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.contactapp.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
