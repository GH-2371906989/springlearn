package com.pojo;

import org.springframework.stereotype.Component;

@Component("dog1")
public class Dog {
    public void shout(){
        System.out.println("狗叫");
    }
}
