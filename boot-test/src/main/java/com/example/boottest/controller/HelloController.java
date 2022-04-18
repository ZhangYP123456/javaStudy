package com.example.boottest.controller;


import com.hello.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


     @Autowired
     MyService service;

    @GetMapping("/gg")
    public String helloController(){

       return  service.hello("kkk");
    }
}
