package com.springsecurity.learnSecurity.userService;


import com.springsecurity.learnSecurity.Entity.User;
import com.springsecurity.learnSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    public User addUser(User user)
    {
        return userRepository.save(user);
    }

}
