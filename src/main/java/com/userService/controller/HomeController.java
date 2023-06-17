package com.userService.controller;

import com.userService.entity.User;
import com.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController
{
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/getAllUser")
    List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/getuser")
    User getUser(@RequestParam String id){
        return userService.getUser(id);
    }
    @GetMapping("/deleteUser/{id}")
    String deleteUser(String id){
        return userService.deleteUser(id);
    }
    @PostMapping("/updateUser")
    User updateUser(User user){
        return userService.updateUser(user);
    }

}
