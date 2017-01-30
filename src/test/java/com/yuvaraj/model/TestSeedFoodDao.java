package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.SeedFoodDao;

public class TestSeedFoodDao {

	public static void main(String[] args) {
     // SeedFood seedFood= new SeedFood();
     // seedFood.setId(18);
	//seedFood.setName("etho");
	//seedFood.setPrice(20);
	
   SeedFoodDao seedFoodDao =new SeedFoodDao();
  // seedFoodDao.save(seedFood);
  // seedFoodDao.delete(18);
  // seedFoodDao.update(8, 15);
   
  final  List<SeedFood> list = seedFoodDao.list();

	final Iterator ii = list.iterator();
	/*
	 * for(Item i:list) { System.out.println(i); }
	 */

	while (ii.hasNext()) {
		final SeedFood seedFood = (SeedFood) ii.next();

		System.out.println(seedFood.getId());
		System.out.println(seedFood.getName());
		System.out.println(seedFood.getPrice());
	}
   
}
}