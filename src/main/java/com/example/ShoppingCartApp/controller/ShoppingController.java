package com.example.ShoppingCartApp.controller;

import com.example.ShoppingCartApp.dao.UserDao;
import com.example.ShoppingCartApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ShoppingController {
    @Autowired
    private UserDao udao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Shopping Cart API";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userRegistration", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> UserRegistration(@RequestBody UserModel um){
        System.out.println(um);
        udao.save(um);
        HashMap<String, String> st = new HashMap<>();
        st.put("status","success");
        return st;
    }
}
