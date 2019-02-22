package com.ws.dataserice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sabdulaziz on 2/22/19.
 */

@RestController
@RequestMapping("/")
public class BaseController {

    @GetMapping
    public String sayHello() {
        return "Hello and Welcome to the EasyNotes application. You can create a new Note by making a POST request to /api/notes endpoint.";
    }
}