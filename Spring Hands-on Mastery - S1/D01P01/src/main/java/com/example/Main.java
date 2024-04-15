package com.example;

import com.example.model.Battery;
import com.example.model.Disc;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Beans loaded by the container:");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName + " : " + context.getBean(beanName).getClass().getSimpleName());
        }
        context.close();
    }
}