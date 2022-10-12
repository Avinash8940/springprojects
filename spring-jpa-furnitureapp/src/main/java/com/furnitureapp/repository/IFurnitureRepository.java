package com.furnitureapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furnitureapp.model.Furniture;

@Repository
public interface IFurnitureRepository extends JpaRepository<Furniture,Integer> {
	
	//List<Furniture>findAll();
	List<Furniture>findByCategory(String category);
	List<Furniture>findByType(String type);
	List<Furniture>findByCategoryAndType(String category,String type);
	List<Furniture>findByFurnitureNameAndShape(String furnitureName,String category);
	List<Furniture>readByFurnitureNameAndMaterial(String furnitureName,String material);
	List<Furniture>readByFurnitureNameAndPriceLessThanEqual(String furnitureName,double price);
	List<Furniture>readByFurnitureNameAndCategory(String furnitureName,String category);

}
