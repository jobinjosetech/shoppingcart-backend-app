package com.example.ShoppingCartApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {
    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Shopping Cart API";
    }
}
