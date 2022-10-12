package com.furnitureapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.furnitureapp.model.Furniture;
import com.furnitureapp.service.IFurnitureService;

@SpringBootApplication
public class SpringJpaFurnitureappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaFurnitureappApplication.class, args);
	}

	
	private IFurnitureService furnitureService;
	@Autowired
	public void setFurnitureService(IFurnitureService furnitureService) {
		this.furnitureService = furnitureService;
	}

	@Override
	public void run(String... args) throws Exception {
		Furniture furniture=new Furniture(1,"table","iron","L-table","hall","round",1000,2);
		Furniture furnitureOne=new Furniture(2,"chair","steel","R-chair","dining room","circle",2000,3);
		Furniture furnitureTwo=new Furniture(3,"bed","wood","beds","bed room","circle",3000,1);
		Furniture furnitureThree=new Furniture(5,"chair","steel","chair","dining hall","circle",500,2);
		furnitureService.addFurniture(furniture);
		furnitureService.addFurniture(furnitureOne);
		furnitureService.addFurniture(furnitureTwo);
		furnitureService.addFurniture(furnitureThree);
		System.out.println(furnitureService.getById(1));
		furnitureService.getByCategory("dining room").forEach(System.out::println);
		furnitureService.getByType("L-table").forEach(System.out::println);
		furnitureService.getByCategoryAndType("dining room","R-chair").forEach(System.out::println);
		furnitureService.getByNameAndShape("table", "round").forEach(System.out::println);
		furnitureService.getByNameAndMaterial("bed", "wood").forEach(System.out::println);
		furnitureService.getByNameAndPrice("chair", 2000).forEach(System.out::println);
		furnitureService.getByNameAndCategory("bed","bed room").forEach(System.out::println);
	}
}
