package com.yuvaraj.validator;

import com.yuvaraj.exception.FooddetailException;
import com.yuvaraj.model.FoodDetail;
import com.yuvaraj.util.IsValidInteger;
import com.yuvaraj.util.IsValidString;

public class FoodDetailsValidator {
	IsValidInteger isValidInteger=new IsValidInteger();
	IsValidString isValidString =new IsValidString();
	public void validid(int id)throws FooddetailException{
		 if(isValidInteger.isnotvalid(id))
		  {
			  throw new FooddetailException("should not be null or should not be negative");
		  }
	}
	public void validfoodid(int id)throws FooddetailException{
		 if(isValidInteger.isnotvalid(id))
		  {
			  throw new FooddetailException("should not be null or should not be negative");
		  }
	}
public void validsession(int id)throws FooddetailException
{
	 if(isValidInteger.isnotvalid(id))
	  {
		  throw new FooddetailException("should not be null or should not be negative");
	  }
}
public void validquantity(int num)throws FooddetailException{
	 if(isValidInteger.isnotvalid(num))
	  {
		  throw new FooddetailException("should not be null or should not be negative");
	  }
}
public void validatesave(FoodDetail foodDetail)throws FooddetailException{
	validid(foodDetail.getId());
	validfoodid(foodDetail.getFoodId().getId());
	validsession(foodDetail.getSessionId().getId());
    validquantity(foodDetail.getQuantity());
	}
public void validatedelete(int id)throws FooddetailException{
	validid(id);
}
}
