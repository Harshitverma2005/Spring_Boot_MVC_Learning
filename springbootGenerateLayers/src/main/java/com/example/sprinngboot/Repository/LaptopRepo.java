package com.example.sprinngboot.Repository;

import org.springframework.stereotype.Repository;

import com.example.sprinngboot.Model.Laptop;

@Repository
public class LaptopRepo {
    public void save(Laptop lap)
    {
        System.out.println("Database Saved");

    }

    
}
