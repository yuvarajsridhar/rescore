package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.SeedFood;
import com.yuvaraj.util.ConnectionUtil;

public class SeedFoodDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(SeedFood seedFood) {

		String sql = "insert into seed_food(id,name,price) values(?,?,?)";
		Object[] params = { seedFood.getId(), seedFood.getName(),seedFood.getPrice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from seed_food where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public void update(int id,int price)
	{
		String sql = "update  seed_food set price=? where id=?";
		int rows = jdbcTemplate.update(sql, price,id);
		System.out.println("No of rows updated: " + rows);
	}
	public List<SeedFood>list(){
		 String sql="select id,name,price from seed_food ";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  SeedFood seedFood = convert(rs);
			  return seedFood;
					  
		 });
	}
		  public SeedFood convert(final ResultSet rs) throws SQLException {
				SeedFood seedFood = new SeedFood();

				seedFood.setId(rs.getInt("ID"));
				seedFood.setName(rs.getString("NAME"));
		        seedFood.setPrice(rs.getInt("price"));
				
				
				return seedFood;
			}
			
	}
	

