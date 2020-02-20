package com.example.smcslearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User show(@RequestParam(value = "id", defaultValue = "1")int id){
        User[] users = new User[10];
        users[0] = new User(1,"Henry", "Wojnicki", "hwojnicki41@gmail.com");
        return users[id-1];
    }
}
