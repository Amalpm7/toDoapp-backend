package com.example.todoAppbackend.Controller;


import com.example.todoAppbackend.Dao.UserDao;
import com.example.todoAppbackend.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signup",consumes = "application/json",produces = "application/json")
    public String Singup(@RequestBody UserModel user){
        System.out.println(user.toString());
        dao.save(user);
        return "{Status:'Success}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<UserModel> Login(@RequestBody UserModel user){
        return (List<UserModel>) dao.Signup(user.getEmail(),user.getPassword());
    }
}
