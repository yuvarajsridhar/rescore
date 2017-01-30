package com.yuvaraj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yuvaraj.model.OrderDetails;
import com.yuvaraj.model.SeedSeat;
import com.yuvaraj.util.ConnectionUtil;

public class OrderDetailsDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(OrderDetails orderDetails) {

		String sql = "insert into order_details(id,seat_no,order_id,price,status_s) values(?,?,?,?,?)";
		Object[] params = { orderDetails.getId(), orderDetails.getSeatNo().getId(),orderDetails.getOrderId(),orderDetails.getPrice(),orderDetails.getStatus() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);


	}
	public void delete(int id)
	{
		String sql = "delete from order_details where order_id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
	public List<OrderDetails>list(){
		 String sql="select id,seat_no,order_id,price,status_s from order_details ";
		  return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 final  OrderDetails orderDetails = convert(rs);
			  return orderDetails;
					  
		 });}
	public OrderDetails convert(final ResultSet rs) throws SQLException {
		OrderDetails orderDetails = new OrderDetails();

		orderDetails.setId(rs.getInt("id"));
	    SeedSeat seedSeat=new SeedSeat();
		seedSeat.setId(rs.getInt("Seat_no"));
		orderDetails.setSeatNo(seedSeat);
        orderDetails.setOrderId(rs.getInt("order_id"));
        orderDetails.setPrice(rs.getInt("price"));
        orderDetails.setStatus(rs.getString("status_s"));
		
		
		return orderDetails;
	}
}
