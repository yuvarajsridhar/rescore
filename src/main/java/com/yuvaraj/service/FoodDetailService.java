package com.yuvaraj.service;

import com.yuvaraj.dao.FoodDeatailDao;
import com.yuvaraj.exception.FooddetailException;
import com.yuvaraj.model.FoodDetail;
import com.yuvaraj.validator.FoodDetailsValidator;

public class FoodDetailService {
FoodDetailsValidator foodDetailsValidator=new FoodDetailsValidator();
public void fooddetailservicesave(FoodDetail foodDetail){
	try{
		foodDetailsValidator.validatesave(foodDetail);
		FoodDeatailDao foodDeatailDao=new FoodDeatailDao();
		foodDeatailDao.save(foodDetail);
	}catch(FooddetailException e){
		e.printStackTrace();
	}
}
public void fooddetailservicedelete(int id){
	try{
		foodDetailsValidator.validatedelete(id);
		FoodDeatailDao foodDeatailDao=new FoodDeatailDao();
		foodDeatailDao.delete(id);
	}catch(FooddetailException e){
		e.printStackTrace();
	}
	
}
}
