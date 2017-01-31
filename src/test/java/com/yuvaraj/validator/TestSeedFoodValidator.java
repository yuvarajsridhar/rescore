package com.yuvaraj.validator;

import com.yuvaraj.model.SeedFood;
import com.yuvaraj.service.SeedFoodService;

public class TestSeedFoodValidator {

	public static void main(String[] args) {
		SeedFood seedFood=new SeedFood();
		seedFood.setId(2);
		seedFood.setName("name");
		seedFood.setPrice(2);
		
		 SeedFoodService seedFoodService=new SeedFoodService();
		 seedFoodService.seedfoodservice(seedFood);

	}

}
