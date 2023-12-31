package com.example.testproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApi {

    @GetMapping()
    String test (){
        return "test";
    }
    @GetMapping("spaghetti")
    String spaghetti(){
        return "Updated with CI/CD!";
    }


    @GetMapping("pizza")
    String pizza(){
        return "PIZZA!";
    }


    @GetMapping("newtest")
    String newtest(){
        return "newtest!";
    }

    @GetMapping("wow")
    String wow(){return "WOW!";}


}
