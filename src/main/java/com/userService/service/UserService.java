package com.userService.service;

import com.userService.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String id);
    String deleteUser(String id);
    User updateUser(User user);

}
