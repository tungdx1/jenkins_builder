package com.example.jenkins_builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {
    @GetMapping("/version")
    public String version() {
        return "1.0";
    }
}
