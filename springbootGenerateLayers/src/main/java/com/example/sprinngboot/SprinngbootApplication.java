package com.example.sprinngboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sprinngboot.Model.Laptop;
import com.example.sprinngboot.Service.LaptopServices;


@SpringBootApplication
public class SprinngbootApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SprinngbootApplication.class, args);

	LaptopServices service = context.getBean(LaptopServices.class)	;

		Laptop laptop = context.getBean(Laptop.class);
		
		service.addlaptop(laptop);
	}

}
