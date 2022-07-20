package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository{
    private int counter;
    private List<Contact> contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        for(var myContact : contacts){
            if (contact.getId()==myContact.getId()){
                myContact = contact;                ;
                return myContact;
            }
        }
        counter++;
        contact.setId(counter);
        contacts.add(contact);
        return contact;
    }

    @Override
    public void delete(Contact contact) {
        contacts.remove(contact);
    }


    @Override
    public void delete(int id) {
        Contact foundContact = findById(id);
        contacts.remove(foundContact);
        }

    @Override
    public Contact findById(int id) {
        for (var contact: contacts){
            if (contact.getId()==id)
                return contact;
        }
        return null;
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
        List<Contact> firstNames = new ArrayList<>();
        for (var contact: contacts){
            if (contact.getFirstName()==firstName){
                firstNames.add(contact);
            }
        }
        return firstNames;
    }

    @Override
    public List<Contact> findByLastName(String lastName) {
        List<Contact> lastNames = new ArrayList<>();
        for (var contact: contacts){
            if (contact.getLastName()==lastName){
                lastNames.add(contact);
            }
        }
        return lastNames;
    }

    @Override
    public List<Contact> findAll() {
        return contacts;
    }

    @Override
    public int count() {
        return contacts.size();
    }
}
