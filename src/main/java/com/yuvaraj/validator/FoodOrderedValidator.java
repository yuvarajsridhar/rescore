package com.yuvaraj.validator;

import com.yuvaraj.exception.FoodOrderedException;
import com.yuvaraj.model.FoodOrdered;
import com.yuvaraj.util.IsValidInteger;
import com.yuvaraj.util.IsValidString;

public class FoodOrderedValidator {
	IsValidInteger isValidInteger=new IsValidInteger();
	IsValidString isValidString=new IsValidString();
	 public void validorderid(int id)throws FoodOrderedException{
		 if(isValidInteger.isnotvalid(id))
		  {
			  throw new FoodOrderedException("should not be null or should not be negative");
		  }
	 }
	 public void validfoodid(int id) throws FoodOrderedException
	 {
		 if(isValidInteger.isnotvalid(id))
		  {
			  throw new FoodOrderedException("should not be null or should not be negative");
		  }
	 }
	 public void validquantity(int num)throws FoodOrderedException{
		 if(isValidInteger.isnotvalid(num))
		  {
			  throw new FoodOrderedException("should not be null or should not be negative");
		  }
	 }
	 public void validprice(int num) throws FoodOrderedException{
		 if(isValidInteger.isnotvalid(num))
		  {
			  throw new FoodOrderedException("should not be null or should not be negative");
		  }
	 }
	 public void validatesave(FoodOrdered foodOrdered)throws FoodOrderedException{
		 validorderid(foodOrdered.getOrderId());
		 validfoodid(foodOrdered.getFoodId().getId());
		 validquantity(foodOrdered.getQuantity());
		 validprice(foodOrdered.getPrice());
	 }
	 public void validatedelete(int id)throws FoodOrderedException{
		 validorderid(id);
	 }
}
