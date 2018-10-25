package com.eric.tutorial.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.eric.tutorial.spring.helloworld.HelloWorld;
import com.eric.tutorial.spring.helloworld.HelloWorldService;

public class HelloProgram {
    public static void main(String[] args) {
        
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
         
        HelloWorldService service =
             (HelloWorldService) context.getBean("helloWorldService");
          
        HelloWorld hw= service.getHelloWorld();
         
        hw.sayHello();
    }
}
