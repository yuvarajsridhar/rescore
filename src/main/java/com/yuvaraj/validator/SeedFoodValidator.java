package com.yuvaraj.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.yuvaraj.exception.SeedFoodException;
import com.yuvaraj.model.SeedFood;

public class SeedFoodValidator {
	private final Logger logger = Logger.getLogger(SeedFoodValidator.class.getName());
	public void validateSave(SeedFood seedFood)
	{
		
		if(0==(seedFood.getId()) || "".equals(seedFood.getName()) || "".equals(seedFood.getPrice()))
		{
			try {
				throw new SeedFoodException("This field cannot be null");
			} catch (SeedFoodException e) {
				
				  logger.log(Level.SEVERE, "Exceptions Happen",e);
			}
		}
		else if((seedFood.getId()>0) || (seedFood.getPrice()>0) )
		{
			try{
				throw new SeedFoodException("should not be negative");
			}catch (SeedFoodException e){
				logger.log(Level.SEVERE, "Exception Happen",e);
			}
		}
	}
}
