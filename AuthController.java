package com.busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.busbooking.entity.User;
import com.busbooking.repository.UserRepository;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        repo.save(user);
        return "User Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User u = repo.findByEmail(user.getEmail());

        if(u != null && u.getPassword().equals(user.getPassword()))
            return "Login Success";

        return "Invalid Login";
    }

}