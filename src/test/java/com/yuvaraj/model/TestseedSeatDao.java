package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.FoodDeatailDao;
import com.yuvaraj.dao.SeedSeatDao;
import com.yuvaraj.service.SeedSeatService;

public class TestseedSeatDao {
 public static void main(String args[]){
	 SeedSeat seedSeat=new SeedSeat();
	 seedSeat.setId(11);
	// seedSeat.setStatus(3);
	 SeedSeatService seedSeatService=new SeedSeatService();
	// seedSeatService.seedseatservicesave(seedSeat);
	 seedSeatService.seedseatservicedelete(11);
	  
	 /*SeedSeatDao seedSeatDao = new SeedSeatDao();
		final  List<SeedSeat> list = seedSeatDao.list();

		final Iterator ii = list.iterator();
		

		while (ii.hasNext()) {
			final SeedSeat seedseat = (SeedSeat) ii.next();

			System.out.println(seedseat.getId());
			System.out.println(seedseat.getStatus());
		
		} */
			
	 
 }
}
