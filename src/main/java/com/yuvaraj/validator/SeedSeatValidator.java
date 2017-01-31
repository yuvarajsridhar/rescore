package com.yuvaraj.validator;

import com.yuvaraj.exception.SeedSeatException;
import com.yuvaraj.model.SeedSeat;
import com.yuvaraj.util.IsValidInteger;
import com.yuvaraj.util.IsValidString;

public class SeedSeatValidator {
	IsValidInteger isValidInteger=new IsValidInteger();
	
  public void validid(int id)throws SeedSeatException
  {
	  if(isValidInteger.isnotvalid(id))
	  {
		  throw new SeedSeatException("should not be null or should not be negative");
	  }
  }
 public void validstatus(int num) throws SeedSeatException
 {
	 if(num!=0 && num !=1)
	 {
		 throw new SeedSeatException("should be 1 or 0");
	 }
 }
 public void validatesave(SeedSeat seedSeat) throws SeedSeatException{
	 validid(seedSeat.getId());
	 validstatus(seedSeat.getStatus());
 }
 public void validatedelete(int id)throws SeedSeatException{
	 validid(id);
 }
}