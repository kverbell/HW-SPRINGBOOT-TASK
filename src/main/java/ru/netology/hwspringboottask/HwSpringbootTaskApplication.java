package ru.netology.hwspringboottask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HwSpringbootTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwSpringbootTaskApplication.class, args);
    }

}
