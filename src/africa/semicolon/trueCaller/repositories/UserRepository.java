package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    void delete(User user);
    void delete(int id);
    User findById(int id);
    List<User> findAll();
    int count();
}
