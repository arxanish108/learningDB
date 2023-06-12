package com.example.databaseLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController  {

    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user ){
          return userService.addUser(user);
    }

    @GetMapping("/findById")
    public User getUserById(@RequestParam("ID") Integer id){
        User user = userService.getUserById(id);
        return user;
    }
}
