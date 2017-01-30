package com.yuvaraj.dao;

import java.sql.Types;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.yuvaraj.util.ConnectionUtil;

public class OrderCancel {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String cancelorder(int orderId)
	{
	        SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("food_cancel")
	                .declareParameters(new SqlParameter("order_id_para", Types.INTEGER),
	                        new SqlOutParameter("err_message", Types.VARCHAR));
	        call.setAccessCallParameterMetaData(false);
	        SqlParameterSource in = new MapSqlParameterSource().addValue("order_id_para", orderId);
	        Map<String, Object> execute = call.execute(in);
	        String status = (String) execute.get("err_message");
	        return status;
	 
	    }
	}

