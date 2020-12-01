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
public class AccidentesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public AccidentesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Accidente> list(){
		//return null;
		String sql = "SELECT * FROM ACCIDENTE";
		
		List<Accidente> listAccidente = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Accidente.class));
		
		return listAccidente;
	}		
	
	public void save(Accidente accidente) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("accidente").usingColumns("fechaacidente", "descripcion","cliente_idcliente");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(accidente);
	    insertActor.execute(param);
	}	
	
	public Accidente get(int idaccidente) {
	    String sql = "SELECT * FROM ACCIDENTE WHERE idaccidente = ?";
	    Object[] args = {idaccidente};
	    Accidente accidente = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Accidente.class));
	    return accidente;
	}	
	
	public void update(Accidente accidente) {
	    String sql = "UPDATE ACCIDENTE SET ACCIDENTE.fechaacidente=:fechaacidente, ACCIDENTE.descripcion=:descripcion, ACCIDENTE.cliente_idcliente=:cliente_idcliente";
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(accidente);
	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
	    template.update(sql, param);   		
	}	
	
	public void delete(int idaccidente) {
	    String sql = "DELETE FROM ACCIDENTE WHERE idaccidente = ?";
	    jdbcTemplate.update(sql, idaccidente);	
	}		
	
}
