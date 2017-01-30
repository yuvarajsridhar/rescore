package com.yuvaraj.model;

import com.yuvaraj.dao.SeedSeatDao;

public class TestseedSeatDao {
 public static void main(String args[]){
	 SeedSeat seedSeat=new SeedSeat();
	 seedSeat.setId(11);
	 seedSeat.setStatus(0);
	 SeedSeatDao seedSeatDao=new SeedSeatDao();
	 seedSeatDao.save(seedSeat);
	 seedSeatDao.delete(11);
	 
 }
}
