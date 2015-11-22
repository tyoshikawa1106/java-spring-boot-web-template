package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
  
  @RequestMapping("/")
    public String index() {
        return "this is Spring Boot Sample!";
    }
}
