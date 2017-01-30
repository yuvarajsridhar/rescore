package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.FoodOrderedDao;

public class TestFoodOrderedDao {

	public static void main(String[] args) {
		/*FoodOrdered foodOrdered  =new FoodOrdered();
		foodOrdered.setId(119);
		
		SeedFood seedFood=new SeedFood();
		seedFood.setId(2);
		foodOrdered.setFoodId(seedFood);
		foodOrdered.setQuantity(2);
		foodOrdered.setPrice(20);*/
		
FoodOrderedDao foodOrderedDao =new FoodOrderedDao();
//foodOrderedDao.save(foodOrdered)

final  List<FoodOrdered> list = foodOrderedDao.list();

final Iterator ii = list.iterator();
/*
 * for(Item i:list) { System.out.println(i); }
 */

while (ii.hasNext()) {
	final FoodOrdered foodOrder = (FoodOrdered) ii.next();

	System.out.println(foodOrder.getOrderId());
	System.out.println(foodOrder.getFoodId().getId());
	System.out.println(foodOrder.getQuantity());
	System.out.println(foodOrder.getPrice());
}
		

	}

}
