package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.FoodOrderedDao;
import com.yuvaraj.service.FoodOrderedService;

public class TestFoodOrderedDao {

	public static void main(String[] args) {
		FoodOrdered foodOrdered  =new FoodOrdered();
		foodOrdered.setOrderId(119);;
		
		SeedFood seedFood=new SeedFood();
		seedFood.setId(0);
		foodOrdered.setFoodId(seedFood);
		foodOrdered.setQuantity(2);
		foodOrdered.setPrice(20);
		FoodOrderedService foodOrderedService=new FoodOrderedService();
		foodOrderedService.foodorderedservicedelete(119);
/*FoodOrderedDao foodOrderedDao =new FoodOrderedDao();
//foodOrderedDao.save(foodOrdered)

final  List<FoodOrdered> list = foodOrderedDao.list();

final Iterator ii = list.iterator();

while (ii.hasNext()) {
	final FoodOrdered foodOrder = (FoodOrdered) ii.next();

	System.out.println(foodOrder.getOrderId());
	System.out.println(foodOrder.getFoodId().getId());
	System.out.println(foodOrder.getQuantity());
	System.out.println(foodOrder.getPrice());
}*/
		

	}

}
