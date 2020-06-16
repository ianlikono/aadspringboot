package com.wingtiptoys.Security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    @PreAuthorize("hasRole('Users')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @PreAuthorize("hasRole('TestGroup')")
    @RequestMapping("/Group1")
    public String groupOne() {
        return "Hello Group 1 Users!";
    }

    @PreAuthorize("hasRole('group1')")
    @RequestMapping("/Group2")
    public String groupTwo() {
        return "Hello Group 2 Users!";
    }
}