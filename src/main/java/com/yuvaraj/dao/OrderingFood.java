package com.yuvaraj.dao;

import java.util.Map;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.yuvaraj.util.ConnectionUtil;

;

public class OrderingFood {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public String foodordering(String name,String quantity,int orderId,int noOfItem,int seatNo )
	{
    SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("chummma")
            .declareParameters(new SqlParameter("food_name",Types.VARCHAR),
            		new SqlParameter("quantity_para",Types.VARCHAR),
            		new SqlParameter("order_id_para",Types.INTEGER),
            		new SqlParameter("no_of_item",Types.INTEGER),
            		new SqlParameter("seat_no_para",Types.INTEGER),
                    new SqlOutParameter("err_message", Types.VARCHAR));
		 
		    
		
    call.setAccessCallParameterMetaData(false);
    SqlParameterSource in = new MapSqlParameterSource().
    		addValue("food_name", name).
    		addValue("quantity_para", quantity).
    		addValue("order_id_para", orderId).
    		addValue("no_of_item", noOfItem).
    		addValue("seat_no_para", seatNo);
    
    
    Map<String, Object> execute = call.execute(in);
    String status = (String) execute.get("err_message");
    return status;
	}
	

}
