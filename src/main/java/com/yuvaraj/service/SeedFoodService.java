package com.yuvaraj.service;

import com.yuvaraj.dao.SeedFoodDao;
import com.yuvaraj.exception.SeedFoodException;
import com.yuvaraj.model.SeedFood;
import com.yuvaraj.validator.SeedFoodValidator;

public class SeedFoodService {


 public void seedfoodservice(SeedFood seedFood)
 {  SeedFoodValidator seedFoodValidator = new SeedFoodValidator();
    try{
 seedFoodValidator.validateSave(seedFood);
 SeedFoodDao seedFoodDao=new SeedFoodDao();
 seedFoodDao.save(seedFood);
    }catch(SeedFoodException e){
    	e.printStackTrace();
    	
    }
      
}
}
