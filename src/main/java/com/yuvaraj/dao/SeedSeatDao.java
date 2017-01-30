package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.FoodDetail;
import com.yuvaraj.model.SeedFood;
import com.yuvaraj.model.SeedSeat;
import com.yuvaraj.model.SeedSession;
import com.yuvaraj.util.ConnectionUtil;

public class SeedSeatDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(SeedSeat seedSeat) {

		String sql = "insert into seed_Seat(id,status) values(?,?)";
		Object[] params = { seedSeat.getId(), seedSeat.getStatus() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	/**
	 * delete seat
	 * @param id
	 */
	public void delete(int id)
	{
		String sql = "delete from seed_seat where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public List<SeedSeat>list(){
		 String sql="select *from seed_seat";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  SeedSeat seedSeat = convert(rs);
			  return seedSeat;
					  
		 });
	}
	public SeedSeat convert(final ResultSet rs) throws SQLException {
		SeedSeat seedSeat = new SeedSeat();
		

		seedSeat.setId(rs.getInt("id"));
		seedSeat.setStatus(rs.getInt("status"));
		
		return seedSeat;
	}
}
