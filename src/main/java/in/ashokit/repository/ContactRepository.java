package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
