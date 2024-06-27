package ru.netology.hwspringboottask.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties("name-is")
public class IsStartedController {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @GetMapping("/")
    private String isStarted() {
        return String.format("%s is started!", name);
    }
}
