package com.example.sprinngboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sprinngboot.Model.Laptop;
import com.example.sprinngboot.Repository.LaptopRepo;

@Service
public class LaptopServices {

    @Autowired
     private LaptopRepo laptopRepo;


    public void addlaptop(Laptop lap)
    {
        System.out.println("Method Called");
        System.out.println("Shree Radhe");
        laptopRepo.save(lap);
    }
    public boolean isGood(Laptop lap)
    {
        return true;
    }

    public LaptopRepo getLaptopRepo() {
        return laptopRepo;
    }

    public void setLaptopRepo(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }



}
