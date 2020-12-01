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
public class ContratosDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ContratosDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Contrato> list(){
		//return null;
		String sql = "SELECT * FROM CONTRATO";
		
		List<Contrato> listContrato = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Contrato.class));
		
		return listContrato;
	}	
	
	public void save(Contrato contrato) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("contrato").usingColumns("detalle", "fechacontrato","cliente_idcliente","plan_idplan");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(contrato);
	    insertActor.execute(param);
	}	
	
	public Contrato get(int idcontrato) {
	    String sql = "SELECT * FROM CONTRATO WHERE idcontrato = ?";
	    Object[] args = {idcontrato};
	    Contrato contrato= jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Contrato.class));
	    return contrato;
	}		

	public void update(Contrato contrato) {
	    String sql = "UPDATE CONTRATO SET CONTRATO.detalle=:detalle, CONTRATO.fechacontrato=:fechacontrato, CONTRATO.cliente_idcliente=:idcliente, CONTRATO.plan_idplan=:plan_idplan";
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(contrato);
	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
	    template.update(sql, param);   		
	}	
	
	public void delete(int idcontrato) {
	    String sql = "DELETE FROM CONTRATO WHERE idcontrato = ?";
	    jdbcTemplate.update(sql, idcontrato);	
	}		
	
}
