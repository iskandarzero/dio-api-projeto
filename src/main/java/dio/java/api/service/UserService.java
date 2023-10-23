package dio.java.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.java.api.model.User;
import dio.java.api.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public void createUser(User user) {
        String hashFalso = "hash" + user.getPassword() + "hash";
        user.setPassword(hashFalso);
        repository.save(user);
    }
    public List<User>  fetchUsers() {
        List<User> allUsers = repository.findAll();
        return allUsers;
    }
    
}
