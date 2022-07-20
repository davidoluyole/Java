package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    @Test
    public void saveTest(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());
    }
    @Test
    public void saveContactCountIncreasesTest(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());
    }
    @Test
    public void saveContactFindByIDTest(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());

        Contact savedContact = contactRepository.findById(1);
        assertEquals("David", savedContact.getFirstName());
    }
    @Test
    public void saveContactDeleteByContactTest(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());

        Contact savedContact = contactRepository.findById(1);
        assertEquals("David", savedContact.getFirstName());

        contactRepository.delete(contact);
        assertEquals(0, contactRepository.count());
    }
    @Test
    public void saveContactDeleteByIdTest(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());

        Contact savedContact = contactRepository.findById(1);
        assertEquals("David", savedContact.getFirstName());

        contactRepository.delete(1);
        assertEquals(0, contactRepository.count());
    }
    @Test
    public void savedContactCanBeUpdated(){
        ContactRepository contactRepository = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setPhoneNumber("09033531336");
        contact.setFirstName("David");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyole");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());

        Contact savedContact = contactRepository.findById(1);
        assertEquals("David", savedContact.getFirstName());

        contact.setPhoneNumber("09013139897");
        contact.setFirstName("Olawole");
        contact.setEmail("davidoluyole@gmail.com");
        contact.setLastName("Oluyoles");

        contactRepository.save(contact);
        assertEquals(1, contactRepository.count());

        savedContact = contactRepository.findById(1);
        assertEquals("Olawole", savedContact.getFirstName());

        Contact contacts = new Contact();

        contacts.setPhoneNumber("09033531336");
        contacts.setFirstName("David");
        contacts.setEmail("davidoluyole@gmail.com");
        contacts.setLastName("Oluyole");

        contactRepository.save(contacts);
        assertEquals(2, contactRepository.count());

        savedContact = contactRepository.findById(2);
        assertEquals("David", savedContact.getFirstName());

//        Contact savedContact = contactRepository.findById(1);
//        assertEquals("David", savedContact.getFirstName());
//
//        savedContact = contactRepository.findById(1);
//        assertEquals("Olawole", savedContact.getFirstName());
    }
}