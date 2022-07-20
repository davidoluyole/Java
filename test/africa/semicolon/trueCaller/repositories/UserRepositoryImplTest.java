package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    @Test
    void UserCanBeCreatedTest(){
        UserRepository userRepository = new UserRepositoryImpl();
        User user = new User();
        user.setEmail("Davidoluyole@gmail.com");
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
    @Test
    void UserCanBeDeletedByUserObject(){
        UserRepository userRepository = new UserRepositoryImpl();
        User user = new User();
        user.setEmail("Davidoluyole@gmail.com");
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.delete(user);
        assertEquals(0,userRepository.count());
    }
    @Test
    void UserCanBeDeletedById(){
        UserRepository userRepository = new UserRepositoryImpl();
        User user = new User();
        user.setEmail("Davidoluyole@gmail.com");
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.delete(1);
        assertEquals(0, userRepository.count());
    }
    @Test
    void UserCanBeFoundById(){
        UserRepository userRepository = new UserRepositoryImpl();
        User user = new User();
        user.setEmail("Davidoluyole@gmail.com");
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        User user1 = userRepository.findById(1);
        assertEquals("Davidoluyole@gmail.com", user1.getEmail());

    }
    @Test
    void AllUsersCanBeSeen(){

    }
}