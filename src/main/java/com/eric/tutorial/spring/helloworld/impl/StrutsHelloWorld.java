package com.eric.tutorial.spring.helloworld.impl;
import com.eric.tutorial.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }
}
