package com.indialone.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/indialone/autowire/xml/autowire_config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
 