package com.indialone.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/indialone/reference/reference_config.xml");
        A aref = (A) context.getBean("aref");
        System.out.println(aref);
        System.out.println(aref.getX());
        System.out.println(aref.getOb().getY());
    }
    
}
