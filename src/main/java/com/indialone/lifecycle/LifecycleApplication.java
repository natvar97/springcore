package com.indialone.lifecycle;

import javax.swing.tree.ExpandVetoException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleApplication {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/indialone/lifecycle/lifecycle_config.xml");
        // Samosa samosa = (Samosa) context.getBean("samosa");
        // System.out.println(samosa);
        context.registerShutdownHook();
        // System.out.println("********************************");

        // Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        // System.out.println(pepsi);
        Example example = (Example) context.getBean("example");
        System.out.println(example);
    }
}
