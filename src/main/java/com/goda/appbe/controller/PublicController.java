package com.goda.appbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    @GetMapping
    public String hello() {
        return "Hi!";
    }
}
