package com.eric.tutorial.spring.helloworld.impl;
import com.eric.tutorial.spring.helloworld.HelloWorld;


public class SpringHelloWorld implements HelloWorld {
	
	@Override
    public void sayHello() {
        System.out.println("Spring Say Hello!!");
    };
}
