package com.yuvaraj.model;


import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.FoodDeatailDao;

public class TestFoodDetailsDao {

	public static void main(String[] args) {
		
		/*FoodDetail foodDetail=new FoodDetail();
		SeedSession seedSession = new SeedSession();
		seedSession.setId(1);
		foodDetail.setId(17);
		SeedFood seedFood = new SeedFood();
		seedFood.setId(14);
		foodDetail.setFoodId(seedFood);
		foodDetail.setSessionId(seedSession);
		foodDetail.setQuantity(15);
	    
		FoodDeatailDao foodDetailDao = new FoodDeatailDao();
		foodDeatailDao.save(foodDetail);*/
		
		FoodDeatailDao foodDetailDao = new FoodDeatailDao();
		final  List<FoodDetail> list = foodDetailDao.list();

		final Iterator ii = list.iterator();
		

		while (ii.hasNext()) {
			final FoodDetail foodDetail = (FoodDetail) ii.next();

			System.out.println(foodDetail.getId());
			System.out.println(foodDetail.getFoodId().getId());
			System.out.println(foodDetail.getSessionId().getId());
			System.out.println(foodDetail.getQuantity());
		}
				

			}

		

	}


