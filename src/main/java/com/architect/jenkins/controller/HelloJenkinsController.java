package com.architect.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkinsController {

    @RequestMapping("/index")
    public String index(){
        return "Hello Jenkins！";
    }
}
