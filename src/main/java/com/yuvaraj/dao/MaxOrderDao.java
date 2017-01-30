package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.MaxOrder;
import com.yuvaraj.model.SeedFood;
import com.yuvaraj.util.ConnectionUtil;

public class MaxOrderDao {
JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(MaxOrder maxOrder) {

		String sql = "insert into max_order(id,max_order,key) values(?,?,?)";
		Object[] params = { maxOrder.getId(), maxOrder.getMaxOrder(),maxOrder.getKey() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from max_order where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public void update(int id,int max_order)
	{
		String sql = "update  max_order set max_order=? where id=?";
		int rows = jdbcTemplate.update(sql, max_order,id);
		System.out.println("No of rows updated: " + rows);
	}
	public List<MaxOrder>list(){
		 String sql="select *from max_order";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  MaxOrder MaxOrder = convert(rs);
			  return MaxOrder;
					  
		 });
	}
		  public MaxOrder convert(final ResultSet rs) throws SQLException {
				MaxOrder maxOrder = new MaxOrder();

				maxOrder.setId(rs.getInt("Id"));
				maxOrder.setMaxOrder(rs.getInt("max_order"));
		        maxOrder.setKey(rs.getString("key"));
				
				
				return maxOrder;
			}
	
}
