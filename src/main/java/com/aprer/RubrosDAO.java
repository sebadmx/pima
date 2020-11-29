package com.aprer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RubrosDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public RubrosDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Rubro> list(){

		String sql = "SELECT * FROM RUBRO";
		
		List<Rubro> listRubro = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Rubro.class));
		
		return listRubro;
	}		
	
}
