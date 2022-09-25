package com.example.Spring_JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {
	 
	@Autowired
	ChuyenBayInterface chuyenBayInterface;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(ChuyenBayInterface chuyenBayInterface) {
		return args ->{
			List<ChuyenBay> chuyBayList = chuyenBayInterface.findAll();
			System.out.println(chuyBayList);
		};
	}

}
