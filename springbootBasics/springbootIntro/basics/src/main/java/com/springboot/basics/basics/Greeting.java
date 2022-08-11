package com.springboot.basics.basics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @RequestMapping("/")
    public String getGreetingAndInfo(){
        String info = "Hello World - My name is Jaden and this is the basics of SpringBoot!";
        return info;
    }
}
