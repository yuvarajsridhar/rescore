package com.yuvaraj.service;

import com.yuvaraj.dao.MaxOrderDao;
import com.yuvaraj.exception.MaxOrderException;
import com.yuvaraj.model.MaxOrder;
import com.yuvaraj.validator.MaxOrderValidator;

public class MaxOrderService {
  public void maxorderservicesave(MaxOrder maxOrder){
		MaxOrderValidator maxOrderValidator=new MaxOrderValidator();
		try {
		    maxOrderValidator.validatesave(maxOrder);
			MaxOrderDao maxOrderDao=new MaxOrderDao();
			maxOrderDao.save(maxOrder);
		}catch (MaxOrderException e){
			e.printStackTrace();
		}
	}
  public void maxorderservicedelete(int id){
	  MaxOrderValidator maxOrderValidator=new MaxOrderValidator();
	  try{
		  maxOrderValidator.validatedelete(id);
			MaxOrderDao maxOrderDao=new MaxOrderDao();
        maxOrderDao.delete(id);
	  } catch(MaxOrderException e)
	  {
		  e.printStackTrace();
	  }
  }
  }

