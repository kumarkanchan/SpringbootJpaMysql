package com.springbootjpa.controller;

import com.springbootjpa.entities.User;
import com.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "user/create")
    public void createUser(@RequestBody User user) {
        userService.createUsers(user);
    }

    @PostMapping(path = "/allusers")
    public Iterable<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PutMapping(path = "id/{id}/newAge/{newAge}")
    public void updateUserAgeById(@PathVariable("id") Integer userId, @PathVariable("newAge") Integer newAge) {
        userService.updateUserAgeById(userId, newAge);
    }

    @DeleteMapping(path = "delete/id/{id}")
    public void deleteUserById(@PathVariable("id") Integer userId){
        userService.deleteUserById(userId);
    }
}
