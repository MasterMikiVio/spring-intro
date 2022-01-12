package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode()==messageService2.hashCode()):

        applicationContext.close();
    }
}
