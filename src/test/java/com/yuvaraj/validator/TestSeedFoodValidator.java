package com.yuvaraj.validator;

import com.yuvaraj.model.SeedFood;

public class TestSeedFoodValidator {

	public static void main(String[] args) {
		SeedFood seedFood=new SeedFood();
		seedFood.setId(2);
		seedFood.setName("name");
		seedFood.setPrice(-2);
		
		 SeedFoodValidator seedFoodValidator =new SeedFoodValidator();
		 seedFoodValidator.validateSave(seedFood);

	}

}
