package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.FoodOrdered;
import com.yuvaraj.model.SeedFood;
import com.yuvaraj.util.ConnectionUtil;

public class FoodOrderedDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	
	
	public void save(FoodOrdered foodOrdered) {

		String sql = "insert into food_ordered(order_id,food_id,quantity,price) values(?,?,?,?)";
		Object[] params = { foodOrdered.getOrderId(), foodOrdered.getFoodId().getId(),foodOrdered.getQuantity(),foodOrdered.getPrice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from food_ordered where order_id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	
	public List<FoodOrdered>list(){
		 String sql="select order_id,food_id,quantity,price from food_ordered ";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  FoodOrdered foodOrdered = convert(rs);
			  return foodOrdered;
					  
		 });
	}
	public FoodOrdered convert(final ResultSet rs) throws SQLException {
		FoodOrdered foodOrdered = new FoodOrdered();

		foodOrdered.setOrderId(rs.getInt("order_id"));
		SeedFood seedFood=new SeedFood();
		seedFood.setId(rs.getInt("food_id"));
		foodOrdered.setFoodId(seedFood);
        foodOrdered.setQuantity(rs.getInt("Quantity"));
        foodOrdered.setPrice(rs.getInt("price"));
		
		
		return foodOrdered;
	}
}
