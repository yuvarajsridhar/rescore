package com.yuvaraj.service;

import com.yuvaraj.dao.FoodOrderedDao;
import com.yuvaraj.exception.FoodOrderedException;
import com.yuvaraj.model.FoodOrdered;
import com.yuvaraj.validator.FoodOrderedValidator;

public class FoodOrderedService {
 FoodOrderedValidator foodOrderedValidator=new FoodOrderedValidator();
 public void foodorderedservicesave(FoodOrdered foodOrdered){
	 try{
		 foodOrderedValidator.validatesave(foodOrdered);
		 FoodOrderedDao foodOrderedDao=new FoodOrderedDao();
		 foodOrderedDao.save(foodOrdered);
	 }catch(FoodOrderedException e){
		 e.printStackTrace();
	 }
 }
 public void foodorderedservicedelete(int id){
	 try{
		 foodOrderedValidator.validatedelete(id);
		 FoodOrderedDao foodOrderedDao=new FoodOrderedDao();
		 foodOrderedDao.delete(id);
	 }catch(FoodOrderedException e){
		 e.printStackTrace();
	 }
 }
}
