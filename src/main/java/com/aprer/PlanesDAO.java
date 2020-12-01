package com.aprer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PlanesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public PlanesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Plan> list(){
		//return null;
		String sql = "SELECT * FROM PLAN";
		
		List<Plan> listPlan = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Plan.class));
		
		return listPlan;
	}	
	
	public void save(Plan plan) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("plan").usingColumns("descripcion", "valortotal");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(plan);
	    insertActor.execute(param);
	}	
	
	public Plan get(int idplan) {
	    String sql = "SELECT * FROM PLAN WHERE idplan = ?";
	    Object[] args = {idplan};
	    Plan plan = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Plan.class));
	    return plan;
	}
	
	public void update(Plan plan) {
	    String sql = "UPDATE PLAN SET PLAN.descripcion=:descripcion, PLAN.valortotal=:valortotal";
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(plan);
	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
	    template.update(sql, param);   		
	}
	
	public void delete(int idplan) {
	    String sql = "DELETE FROM PLAN WHERE idplan = ?";
	    jdbcTemplate.update(sql, idplan);	
	}	
	
}
