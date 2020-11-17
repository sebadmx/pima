package com.aprer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class ProfesionalesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ProfesionalesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Profesional> list(){
		//return null;
		String sql = "SELECT * FROM PROFESIONAL";
		
		List<Profesional> listProfesional = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Profesional.class));
		
		return listProfesional;
	}
	public void save(Profesional profesional) {
		
	}
	public Profesional get(int idprofesional) {
		return null;
	}
	public void update(Profesional profesional) {
		
	}
	public void delete(int idprofesional) {
		
	}
}
