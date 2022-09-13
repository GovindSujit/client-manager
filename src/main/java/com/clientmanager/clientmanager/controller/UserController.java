package com.clientmanager.clientmanager.controller;

import com.clientmanager.clientmanager.model.UserDetails;
import com.clientmanager.clientmanager.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/v1/enroll")
    public void enroll(@RequestBody UserDetails userDetails){
        userService.saveUserDetails(userDetails);
    }

}
