package com.example.smcslearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
    @GetMapping("/bob")
    public String bob() {
        String yeet = "hello";
        return yeet;
    }
}
