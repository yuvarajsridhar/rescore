package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.SeedSession;
import com.yuvaraj.util.ConnectionUtil;

public class SeedSessiondao {
JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(SeedSession seedSession) {

		String sql = "insert into seed_session(id,session,start_time,end_time) values(?,?,?,?)";
		Object[] params = { seedSession.getId(), seedSession.getSession(),seedSession.getStartTime(),seedSession.getEndTime() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from seed_session where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public void update(int id,LocalTime startTime,LocalTime endTime)
	{
		String sql = "update  seed_session set start_time=?,end_time=? where id=?";
		int rows = jdbcTemplate.update(sql,startTime,endTime,id);
		System.out.println("No of rows updated: " + rows);
	}
	public List<SeedSession>list(){
		 String sql="select * from seed_session ";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  SeedSession seedSession = convert(rs);
			  return seedSession;
					  
		 });
	}
		  public SeedSession convert(final ResultSet rs) throws SQLException {
				SeedSession seedSession = new SeedSession();

				seedSession.setId(rs.getInt("Id"));
				seedSession.setSession(rs.getString("session"));
		        seedSession.setStartTime(rs.getTime("start_time").toLocalTime());
		        seedSession.setEndTime(rs.getTime("end_time").toLocalTime());
				
				
				return seedSession;
			}
			
}
