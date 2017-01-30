package com.yuvaraj.model;

import java.time.LocalTime;

import com.yuvaraj.dao.SeedSessiondao;

public class TestSeedSessionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SeedSession seedSession = new SeedSession();
    seedSession.setId(5);
    seedSession.setSession("chumma");
    seedSession.setStartTime(LocalTime.parse("11:00:00"));
    seedSession.setEndTime(LocalTime.parse("12:00:00"));
    
    SeedSessiondao seedSessionDao =new SeedSessiondao();
    seedSessionDao.save(seedSession);
	}

}
