package com.elec5619.BestCarePet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloWorld {

    @GetMapping
    public String hello(){
        return "hello world for elec5619 project!!!";
    }
}