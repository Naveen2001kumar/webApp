package com.naveen.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @GetMapping("/")
    public String getHome(){
        return "<h>I love kutty and naveen</h>";
    }
}
