package com.example.sprinngboot.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Alein {

    @Value("19")
    private int age ;

    @Value("Radha")
    private String name ;

    @Autowired
    @Qualifier("desktop")
   private Computer computer;


    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Alein() {
        System.out.println("Alien Object Created");
    }

    public void Code()
    {
        computer.compile();
        System.out.println(getAge()+" "+getName())
        ;

        System.out.println("Coding");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
