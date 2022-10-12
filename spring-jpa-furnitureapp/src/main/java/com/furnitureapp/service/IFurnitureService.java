package com.furnitureapp.service;

import java.util.List;

import com.furnitureapp.model.Furniture;

public interface IFurnitureService {
	void addFurniture(Furniture furniture);
	void updateFurniture(Furniture furniture);
	void deleteFurniture(Integer furnitureId);
	Furniture getById (Integer furnitureId);
	List<Furniture> getAllFurnitures();
	List<Furniture> getByCategory(String category);
	List<Furniture> getByType(String type);
	List<Furniture> getByCategoryAndType(String category,String type);
	List<Furniture> getByNameAndShape(String furnitureName,String shape);
	List<Furniture> getByNameAndMaterial(String furnitureName,String material);
	List<Furniture> getByNameAndPrice(String furnitureName,double price);
	List<Furniture> getByNameAndCategory(String furnitureName,String category);
}
