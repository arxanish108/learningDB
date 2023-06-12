package com.example.databaseLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User saved successfully";
    }

    public User getUserById(Integer id) {
        User user = userRepository.findById(id).get();
        return user;
    }
}
