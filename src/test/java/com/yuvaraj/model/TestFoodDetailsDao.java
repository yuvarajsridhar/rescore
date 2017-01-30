package com.yuvaraj.model;


import com.yuvaraj.dao.FoodDeatailDao;

public class TestFoodDetailsDao {

	public static void main(String[] args) {
		
		FoodDetail foodDetail=new FoodDetail();
		SeedSession seedSession = new SeedSession();
		seedSession.setId(1);
		foodDetail.setId(17);
		SeedFood seedFood = new SeedFood();
		seedFood.setId(14);
		foodDetail.setFoodId(seedFood);
		foodDetail.setSessionId(seedSession);
		foodDetail.setQuantity(15);
	    
		FoodDeatailDao foodDeatailDao = new FoodDeatailDao();
		foodDeatailDao.save(foodDetail);
		

	}

}
