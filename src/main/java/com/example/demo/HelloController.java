package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getthis")
    String printmyName(){
        return "My name is RSD";
    }
    @GetMapping("/")
    String printHello(){
        return "This is an empty getApi.";
    }
}
