package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class People{

    private String name = "Ivan";
   // @Autowired
    private final Dog dog;

   /* @Autowired*/
    public People(@Qualifier("dog2") Dog dog){
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    //@Autowired
   /* public void setDog(Dog dog) {
        this.dog = dog;
    }*/

    @Override
    public String toString() {
        return "People: " + name;
    }
}
