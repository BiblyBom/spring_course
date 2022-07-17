package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("dogBean")
public class Dog implements Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void sound() {
        System.out.println("Bow-Wow");
    }
}
