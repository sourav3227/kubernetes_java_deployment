package uk.co.danielbryant.djshopping.stockmanager;
package com.example.springbootmanagementexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StockManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockManagerApplication.class, args);
    }
}
@RestController
public class SimpleRestController {
     @GetMapping("/example")
     public String example() {
         return "Hello User !! " + new Date();
     }
}
