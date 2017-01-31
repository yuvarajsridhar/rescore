package com.yuvaraj.service;

import com.yuvaraj.dao.SeedSeatDao;
import com.yuvaraj.exception.SeedSeatException;
import com.yuvaraj.model.SeedSeat;
import com.yuvaraj.validator.SeedSeatValidator;

public class SeedSeatService {
public void seedseatservicesave(SeedSeat seedSeat){
	SeedSeatValidator seedSeatValidator=new SeedSeatValidator();
	try {
		seedSeatValidator.validatesave(seedSeat);
		SeedSeatDao seedSeatDao=new SeedSeatDao();
		seedSeatDao.save(seedSeat);
	}catch (SeedSeatException e){
		e.printStackTrace();
	}
}
public void seedseatservicedelete(int id){
	SeedSeatValidator seedSeatValidator=new SeedSeatValidator();
	try {
		//SeedSeat seedSeat=new SeedSeat();
		seedSeatValidator.validatedelete(id);
		SeedSeatDao seedSeatDao=new SeedSeatDao();
		seedSeatDao.delete(id);
	}catch (SeedSeatException e){
		e.printStackTrace();
	}
}
}
