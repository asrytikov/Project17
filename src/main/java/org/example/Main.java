package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        People people = context.getBean(People.class);
       // Dog dog = context.getBean(Dog.class);

        System.out.println("People name: " + people.getName());
       // System.out.println("Dog name: " + dog.getName());
        System.out.println("People's dog: "+people.getDog());

    }
}