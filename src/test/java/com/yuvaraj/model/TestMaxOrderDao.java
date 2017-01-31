package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.MaxOrderDao;
import com.yuvaraj.service.MaxOrderService;

public class TestMaxOrderDao {

	public static void main(String[] args) {
		
		MaxOrder maxOrder = new MaxOrder();
		maxOrder.setId(2);
		
		maxOrder.setMaxOrder(6);
		maxOrder.setKey("");
		
		MaxOrderService maxOrderService=new MaxOrderService();
		//maxOrderService.maxorderservicesave(maxOrder);
		maxOrderService.maxorderservicedelete(0);
		
	/*	MaxOrderDao maxOrderDao=new MaxOrderDao();
		 final  List<MaxOrder> list = maxOrderDao.list();

			final Iterator ii = list.iterator();
			
			while (ii.hasNext()) {
				final MaxOrder maxOrder = (MaxOrder) ii.next();

				System.out.println(maxOrder.getId());
				System.out.println(maxOrder.getMaxOrder());
				
				System.out.println(maxOrder.getKey());
			}*/

	}

}
