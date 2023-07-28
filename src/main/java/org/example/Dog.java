package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Dog {

    private String name = "Sharik";

    //private People people;


 /*   public Dog(People people) {
        this.people = people;
    }*/

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
