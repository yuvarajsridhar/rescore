package com.yuvaraj.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.yuvaraj.exception.SeedFoodException;
import com.yuvaraj.model.SeedSeat;

public class SeedSeatValidator {
	private final Logger logger = Logger.getLogger(SeedFoodValidator.class.getName());
  public void validatesave(SeedSeat seedSeat)
  {
	  if((seedSeat.getId())==0 || "".equals(seedSeat.getStatus()))
	  {
		  try{
			  throw new SeedFoodException("this field cannot be null");
		  }
		  catch (SeedFoodException e)
		  {
			  logger.log(Level.INFO ,"Exception occur",e);
		  }
	  }else if ((seedSeat.getStatus()!="0") && (seedSeat.getStatus()!="1"))
	  {
		 try{
			 throw new SeedFoodException("shoud be 0 or 1");
		 }catch(SeedFoodException e){
			 logger.log(Level.INFO,"Exception occur",e);
		 }
	  }
  else if (seedSeat.getId()<0)
  {
	 try{
		 throw new SeedFoodException("shoud not be negative");
	 }catch(SeedFoodException e){
		 logger.log(Level.INFO,"Exception occur",e);
	 }
  }
}
}