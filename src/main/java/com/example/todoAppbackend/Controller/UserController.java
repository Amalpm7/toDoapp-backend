package com.example.todoAppbackend.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @CrossOrigin(origins = "*")
    @PostMapping("/signup")
    public String signUp(){
        return "welcome";
    }
}
