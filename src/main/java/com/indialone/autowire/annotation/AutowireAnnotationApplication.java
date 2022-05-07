package com.indialone.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/indialone/autowire/annotation/autowire_config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
 