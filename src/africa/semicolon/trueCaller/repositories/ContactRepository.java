package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;

import java.util.List;

public interface ContactRepository {
    Contact save(Contact contact);
    void delete(Contact contact);
    void delete(int id);
    Contact findById(int Id);
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName(String firstName);
    List<Contact> findAll();
    int count();
}
