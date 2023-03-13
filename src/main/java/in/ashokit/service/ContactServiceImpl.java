package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public String upsert(Contact contact) {
		contactRepository.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContact() {
		contactRepository.findAll();
		return null;
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById = contactRepository.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		
		Optional<Contact> findById = contactRepository.findById(cid);
		if(findById.isPresent()) {
			Contact contact= findById.get();
			contact.setActveSw("N");
			contactRepository.save(contact);
		}
		return null;
	}

}
