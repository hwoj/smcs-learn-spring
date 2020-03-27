package com.example.smcslearn;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
public class PersonalityController {

    @GetMapping("/personality")
    @CrossOrigin("http://localhost:4200")
    public Question[] personalityQuestions(){
        Question[] questions = new Question[32];
        questions[0] = new Question("Do you trust information after hearing from one source?");
        questions[1] = new Question("Do you get easily upset during conversations with others who contradict your views?");
        questions[2] = new Question("Do you change your mind easily if you were wrong?");
        questions[3] = new Question("Do you get upset at those who use insults as arguments in their favour?");
        questions[4] = new Question("Do you notice personal growth every day?");
        questions[5] = new Question("Do you have innovative ideas?");
        questions[6] = new Question("Do you over analyze situations?");
        questions[7] = new Question("Do you expect too much from yourself?");
        questions[8] = new Question("Do you like to go out to the movies with friends?");
        questions[9] = new Question("Do you like to play games by yourself?");
        questions[10] = new Question("Do you enjoy reading?");
        questions[11] = new Question("Do you enjoy meeting new people?");
        questions[12] = new Question("Would you rather stay in then go out?");
        questions[13] = new Question("Do you like to reflect on your experiences?");
        questions[14] = new Question("Do you like being the centre of attention?");
        questions[15] = new Question("Do you usually get noticed right away in class?");
        questions[16] = new Question("Are you not interested in other people's problems?");
        questions[17] = new Question("Are you concerned about others?");
        questions[18] = new Question("Do you use others for your own ends?");
        questions[19] = new Question("Do you try not to think about the needy?");
        questions[20] = new Question("Are you indifferent to the feelings of others?");
        questions[21] = new Question("Do you obstruct others' plans?");
        questions[22] = new Question("Do you boast about my virtues?");
        questions[23] = new Question("Do you think you are better then others?");
        questions[24] = new Question("Do you have an academic goal in mind?");
        questions[25] = new Question("Do you try to complete all your homework?");
        questions[26] = new Question("Do you go in for extra help?");
        questions[27] = new Question("Do you pay attention in class?");
        questions[28] = new Question("Do you have an organized binder?");
        questions[29] = new Question("Do you bring all materials needed to class?");
        questions[30] = new Question("Do you take pride in your work?");
        questions[31] = new Question("Are you interested in what you are learning?");

        //For questions they are divided up from 0-7 as critical thinking, 8-15 as introvert and extrovert,
        // 16-23 as agreeableness and the rest for eagerness to learn

        return questions;
    }
    RestTemplate restTemplate;
    @PostMapping(path = "/personality",consumes = "application/json", produces = "application/json")
    public void receiveAnswers(@RequestBody String[] answers){

    }
}