package com.yuvaraj.validator;

import com.yuvaraj.model.SeedSeat;

public class TestSeedSeatValidator {

	public static void main(String[] args) {
	 SeedSeat seedSeat =new SeedSeat();
	 seedSeat.setId(1);
	 seedSeat.setStatus("1");
	 
	 SeedSeatValidator seedSeatValidator =new SeedSeatValidator();
	 seedSeatValidator.validatesave(seedSeat);

	}

}
