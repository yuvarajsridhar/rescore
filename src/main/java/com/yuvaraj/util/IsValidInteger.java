package com.yuvaraj.util;

public class IsValidInteger {
  public boolean isnotvalid(Integer num)
  {
	  return (num==null || num.intValue()<=0);
  }
}
