package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;
import africa.semicolon.trueCaller.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int counter = 0;
    List<User> users = new ArrayList<>();
    List<Contact> contacts = new ArrayList<>();

    @Override
    public User save(User user) {
        for (var user1:users){
            if (user1.getId()== user.getId()){
                user1=user;
                return user1;
            }
        }
        counter++;
        user.setId(counter);
        users.add(user);
        return user;
    }
    @Override
    public void delete(User user) {
        users.remove(user);
    }
    @Override
    public void delete(int id) {
        User user2 = findById(id);
        users.remove(user2);
    }
    @Override
    public User findById(int id) {
        for (var user:users)
            if (user.getId()==id){
                return user;
            }
        return null;
    }
    @Override
    public List<User> findAll() {
        return users;
    }
    @Override
    public int count() {
        return users.size();
    }
}
