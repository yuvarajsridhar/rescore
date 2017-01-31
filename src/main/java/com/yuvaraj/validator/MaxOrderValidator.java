package com.yuvaraj.validator;

import com.yuvaraj.exception.MaxOrderException;
import com.yuvaraj.model.MaxOrder;
import com.yuvaraj.util.IsValidInteger;
import com.yuvaraj.util.IsValidString;

public class MaxOrderValidator {
	IsValidInteger isValidInteger=new IsValidInteger();
	IsValidString isValidString=new IsValidString();
 public void validid(int id) throws MaxOrderException{
	 if(isValidInteger.isnotvalid(id)){
		 throw new MaxOrderException("id should be greter than 0");
	 }
 }
 public void validmaxorder(int num)throws MaxOrderException
 {
	 if(isValidInteger.isnotvalid(num)){
		 throw new MaxOrderException("maxorder should be greter than 0");
	 }
 }
 public void validkey(String str)throws MaxOrderException
 {
	 if(isValidString.isnotvalid(str)){
		 throw new MaxOrderException("key should not be null");
	 }
 }
 public void validatesave(MaxOrder maxOrder)throws MaxOrderException
 {
	 validid(maxOrder.getId());
	 validmaxorder(maxOrder.getMaxOrder());
	 validkey(maxOrder.getKey());
 }
 public void validatedelete(int id)throws MaxOrderException
 {
	 validid(id);
 }
}
