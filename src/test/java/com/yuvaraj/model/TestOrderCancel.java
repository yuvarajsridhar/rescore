package com.yuvaraj.model;

import com.yuvaraj.dao.OrderCancel;

public class TestOrderCancel {

	public static void main(String[] args) {
		OrderCancel orderCancel =new OrderCancel();
		String status= orderCancel.cancelorder(121);
		System.out.println(status);

	}

}
