package com.indialone.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiApplication {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/indialone/ci/ci_config.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
