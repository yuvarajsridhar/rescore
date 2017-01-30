package com.yuvaraj.model;

import com.yuvaraj.dao.OrderingFood;

public class TestOrderingFood {

	public static void main(String[] args) {
		OrderingFood orderingFood=new OrderingFood();
		
		String status = orderingFood.foodordering("idly","1",121,1,4);
		System.out.println(status);
		

	}

}
