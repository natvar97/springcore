package com.indialone.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/indialone/standalone/standalone_config.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getFriends());
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass().getName());
        System.out.println(person.getProperties());
        System.out.println(person.getProperties().getClass().getName());
    }
}
