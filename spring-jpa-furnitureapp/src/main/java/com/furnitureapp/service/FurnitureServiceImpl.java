package com.furnitureapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureapp.model.Furniture;
import com.furnitureapp.repository.IFurnitureRepository;

@Service
public class FurnitureServiceImpl implements IFurnitureService {

	IFurnitureRepository furnitureRepository;
	
	@Autowired
	public void setFurnitureRepository(IFurnitureRepository furnitureRepository) {
		this.furnitureRepository = furnitureRepository;
	}

	@Override
	public void addFurniture(Furniture furniture) {
		furnitureRepository.save(furniture);
		
	}

	@Override
	public void updateFurniture(Furniture furniture) {
		furnitureRepository.save(furniture);
		
	}

	@Override
	public void deleteFurniture(Integer furnitureId) {
		furnitureRepository.deleteById(furnitureId);
		
	}

	@Override
	public Furniture getById(Integer furnitureId) {
		return furnitureRepository.findById(furnitureId).get();
	}

	@Override
	public List<Furniture> getAllFurnitures() {
		return furnitureRepository.findAll();
	}

	@Override
	public List<Furniture> getByCategory(String category) {
		return furnitureRepository.findByCategory(category);
	}

	@Override
	public List<Furniture> getByType(String type) {
		return furnitureRepository.findByType(type);
	}

	@Override
	public List<Furniture> getByCategoryAndType(String category, String type) {
		// TODO Auto-generated method stub
		return furnitureRepository.findByCategoryAndType(category, type);
	}

	@Override
	public List<Furniture> getByNameAndShape(String furnitureName, String shape) {
		
		return furnitureRepository.findByFurnitureNameAndShape(furnitureName, shape);
	}

	@Override
	public List<Furniture> getByNameAndMaterial(String furnitureName, String material) {
		
		return furnitureRepository.readByFurnitureNameAndMaterial(furnitureName, material);
	}

	@Override
	public List<Furniture> getByNameAndPrice(String furnitureName, double price) {
		
		return furnitureRepository.readByFurnitureNameAndPriceLessThanEqual(furnitureName, price);
	}

	@Override
	public List<Furniture> getByNameAndCategory(String furnitureName, String category) {
		
		return furnitureRepository.readByFurnitureNameAndCategory(furnitureName, category);
	}
	

}