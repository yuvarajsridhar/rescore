package com.yuvaraj.model;

import java.util.Iterator;
import java.util.List;

import com.yuvaraj.dao.SeedSessiondao;

public class TestSeedSessionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*   SeedSession seedSession = new SeedSession();
    seedSession.setId(5);
    seedSession.setSession("chumma");
    seedSession.setStartTime(LocalTime.parse("11:00:00"));
    seedSession.setEndTime(LocalTime.parse("12:00:00"));
    
    SeedSessiondao seedSessionDao =new SeedSessiondao();
    seedSessionDao.save(seedSession); */
		SeedSessiondao seedSessiondao =new SeedSessiondao();
		final  List<SeedSession> list = seedSessiondao.list();

		final Iterator ii = list.iterator();
				while (ii.hasNext()) {
			final SeedSession seedSession = (SeedSession) ii.next();

			System.out.println(seedSession.getId());
			System.out.println(seedSession.getSession());
			System.out.println(seedSession.getStartTime());
			System.out.println(seedSession.getEndTime());
		}
	   
	}

}
