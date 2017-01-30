package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.FoodDetail;
import com.yuvaraj.model.SeedFood;
import com.yuvaraj.model.SeedSession;
import com.yuvaraj.util.ConnectionUtil;

public class FoodDeatailDao {
JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(FoodDetail foodDetail) {

		String sql = "insert into food_details(id,food_id,session,quantity) values(?,?,?,?)";
		Object[] params = { foodDetail.getId(),foodDetail.getFoodId().getId(),foodDetail.getSessionId().getId(),foodDetail.getQuantity() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from food_details where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public void update(int id,int quantity)
	{
		String sql = "update  food_details set quantity=? where id=?";
		int rows = jdbcTemplate.update(sql, quantity,id);
		System.out.println("No of rows updated: " + rows);
	}
	public List<FoodDetail>list(){
		 String sql="select *from food_details ";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  FoodDetail foodDetail = convert(rs);
			  return foodDetail;
					  
		 });
	}
	public FoodDetail convert(final ResultSet rs) throws SQLException {
		FoodDetail foodDetail = new FoodDetail();

		foodDetail.setId(rs.getInt("id"));
		SeedFood seedFood=new SeedFood();
		seedFood.setId(rs.getInt("food_id"));
		foodDetail.setFoodId(seedFood);
         SeedSession seedSession = new SeedSession();
       seedSession.setId(rs.getInt("session"));
       foodDetail.setSessionId(seedSession);
       
       foodDetail.setQuantity(rs.getInt("quantity"));
		
		
		return foodDetail;
	}
}
