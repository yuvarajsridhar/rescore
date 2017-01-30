package com.yuvaraj.model;

import com.yuvaraj.dao.MaxOrderDao;

public class TestMaxOrderDao {

	public static void main(String[] args) {
		MaxOrder maxOrder = new MaxOrder();
		maxOrder.setId(2);
		
		maxOrder.setMaxOrder(6);
		maxOrder.setKey("week day");
		
		MaxOrderDao maxOrderDao=new MaxOrderDao();
		maxOrderDao.save(maxOrder);

	}

}
