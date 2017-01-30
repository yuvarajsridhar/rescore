package com.yuvaraj.model;

import lombok.Data;

@Data
public class OrderDetails {
	private int id;
	private SeedSeat seatNo;
	private int orderId;
	private int price;
	private String status;
	
	

}
