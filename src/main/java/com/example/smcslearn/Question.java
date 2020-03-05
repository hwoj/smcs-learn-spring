package com.example.smcslearn;
import org.springframework.web.bind.annotation.CrossOrigin;
public class Question {
    private String question;
    public Question(String question){
        this.question  = question;
    }

    public String getQuestion(){
        return this.question;
    }
}
