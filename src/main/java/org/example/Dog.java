package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name = "Sharik";

    public Dog() {
        System.out.println("Dog created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}
