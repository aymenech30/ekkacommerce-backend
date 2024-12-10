package com.ekkacommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("/test2")
    public String test2() {
        return "Hello World! 22222";
    }

    @GetMapping("/testadmin")
    public String testAdmin() {
        return "Hello World! ADMIN";
    }
}
