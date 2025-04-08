package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@SpringBootApplication

public class MyApplication {
    private final int array[] = { 2, 52, 12, 51, 33, 1, 51, 3 };

    @RequestMapping("/number")
    Number count(Number args) {

        return 2;
    }

    @RequestMapping("/")
    String home() {
        System.out.println("Home endpoint called!");
        return "Hello World!";
    }

    @GetMapping("/array")
    int[] test() {
        return array;
    }

    @PostMapping()

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
