package com.springsecurity.learnSecurity.controller;


import com.springsecurity.learnSecurity.Entity.User;
import com.springsecurity.learnSecurity.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public String page(){
        return "user";
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAll()
    {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

}
