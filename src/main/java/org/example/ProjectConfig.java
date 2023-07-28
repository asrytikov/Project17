package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    public Dog dog1(){
        Dog dog = new Dog();
        dog.setName("Sharik");
        return dog;
    }

   /* @Bean
    public People people(){
        People people = new People();
        people.setName("Ivan");
        people.setDog(dog());
        return people;
    }*/

    @Bean
    public Dog dog2(){
        Dog dog = new Dog();
        dog.setName("Tuzik");
        return dog;
    }

/*    @Bean
    public People people(@Qualifier("dog1") Dog dog){
        People people = new People();
        people.setName("Ivan");
        people.setDog(dog);
        return people;
    }
*/
}
