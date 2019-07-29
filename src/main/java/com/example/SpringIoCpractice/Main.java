package com.example.SpringIoCpractice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main implements ApplicationRunner{
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
        HelloWorld hw=(HelloWorld)context.getBean("helloWorld");
        hw.getHello();
    }
}
