package com.example;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.Itool;

@Service
public class ItoolImp implements Itool {
    @Override
    public String say() {
        return "hello WDD";
    }
}
