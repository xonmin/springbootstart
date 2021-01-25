package com.example.xonmin.springbootstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

   @Autowired
   XonminProperties xonminProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(xonminProperties.getName());
        System.out.println(xonminProperties.getAge());
        System.out.println(xonminProperties.getFullName());
        System.out.println(xonminProperties.getSessionTimeout());
    }
}
