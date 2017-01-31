package com.yuvaraj.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.yuvaraj.exception.SeedFoodException;
import com.yuvaraj.model.SeedFood;

public class SeedFoodValidator {
	
	public void validateSave(SeedFood seedFood) throws SeedFoodException
	{
		
		if(0==(seedFood.getId()) || "".equals(seedFood.getName()) || "".equals(seedFood.getPrice()))
		{
			
				throw new SeedFoodException("This field cannot be null");
		
		}
		else if((seedFood.getId()<0) || (seedFood.getPrice()<0) )
		{
		
				throw new SeedFoodException("should not be negative");
			
		}
	}
}
