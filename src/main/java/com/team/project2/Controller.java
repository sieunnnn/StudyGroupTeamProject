package com.team.project2;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping(value = "/")
    public String helloWorld() {
        return "hello!";
    }
}
