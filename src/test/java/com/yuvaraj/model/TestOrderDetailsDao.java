package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.OrderDetailsDao;

public abstract class TestOrderDetailsDao {

	public static void main(String[] args) {
	//insert
		/*OrderDetails  orderDetails =new OrderDetails();
		orderDetails.setId(145);
		SeedSeat seedSeat =new SeedSeat();
		seedSeat.setId(11);
		orderDetails.setSeatNo(seedSeat);
		orderDetails.setOrderId(118);
		orderDetails.setPrice(110);
		orderDetails.setStatus("ordered");
		OrderDetailsDao orderDetailsDao=new OrderDetailsDao();
		orderDetailsDao.save(orderDetails);*/
		
		//delete
	/*OrderDetailsDao orderDetailsDao = new OrderDetailsDao();
	orderDetailsDao.delete(11);*/
		
		//select
		OrderDetailsDao orderDetailsDao = new OrderDetailsDao();
		final  List<OrderDetails> list = orderDetailsDao.list();

		final Iterator ii = list.iterator();
		/*
		 * for(Item i:list) { System.out.println(i); }
		 */

		while (ii.hasNext()) {
			final OrderDetails orderDetails = (OrderDetails) ii.next();

			System.out.println(orderDetails.getId());
			System.out.println(orderDetails.getSeatNo().getId());
			System.out.println(orderDetails.getOrderId());
			System.out.println(orderDetails.getPrice());

			System.out.println(orderDetails.getStatus());
		}
				

			}

		
		
		
		

	}


