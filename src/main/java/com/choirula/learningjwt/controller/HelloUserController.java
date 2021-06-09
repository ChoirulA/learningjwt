package com.choirula.learningjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserController {

    @RequestMapping("/hello")
    public String firstPage(){
        return "Hello user";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(){
        return "Test";
    }
}
