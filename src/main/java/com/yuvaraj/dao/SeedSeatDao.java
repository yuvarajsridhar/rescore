package com.yuvaraj.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.SeedSeat;
import com.yuvaraj.util.ConnectionUtil;

public class SeedSeatDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(SeedSeat seedSeat) {

		String sql = "insert into seed_Seat(id,status) values(?,?)";
		Object[] params = { seedSeat.getId(), seedSeat.getStatus() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from seed_seat where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
}
