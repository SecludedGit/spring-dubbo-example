package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.Itool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contr {
    @Reference
    Itool itool;

    @RequestMapping("/hello")
    public String sayhello() {
        return itool.say();
    }
}
