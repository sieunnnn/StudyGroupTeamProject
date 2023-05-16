package com.team.project2;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping(value = "/")
    public String helloWorld() {
        return "hello!";
    }
    
    @GetMapping(value = "/test")
    public String helloWorldtest() {
    	System.out.println("test");
        return "hello!";
    }
}
