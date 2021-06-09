package com.choirula.learningjwt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloUserController {

    @GetMapping("/user")
    public String firstPage(){
        return "Hello user";
    }

    @PostMapping("/admin")
    public String test(){
        return "Hello Admin";
    }
}
