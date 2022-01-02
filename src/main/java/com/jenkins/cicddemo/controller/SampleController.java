package com.jenkins.cicddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String get(){
        return "Sample Controller app is working 1";
    }
}
