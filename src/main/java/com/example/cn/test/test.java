package com.example.cn.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class test {

    @GetMapping(value = "/toTest")
    public String test(){
        return "helloWorld,mrj";
    }
}
