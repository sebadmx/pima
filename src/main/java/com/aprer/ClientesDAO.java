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
public class ClientesDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ClientesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	
	
	public List<Cliente> list(){

		String sql = "SELECT * FROM CLIENTE";
		
		List<Cliente> listCliente = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));
		
		return listCliente;
	}	

	public void save(Cliente cliente) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("cliente").usingColumns("nombre", "appaterno", "apmaterno", "rut", "dv", "direccion", "telefono", "email", "rubro_idrubro");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(cliente);
	    insertActor.execute(param);
	}	
	
	public Cliente get(int idcliente) {
	    String sql = "SELECT * FROM CLIENTE WHERE idcliente = ?";
	    Object[] args = {idcliente};
	    Cliente cliente = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Cliente.class));
	    return cliente;
	}	
	
	public void update(Cliente cliente) {
	    String sql = "UPDATE CLIENTE SET";
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(cliente);
	 
	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
	    template.update(sql, param);   		
	}
	
	public void delete(int idcliente) {
	    String sql = "DELETE FROM CLIENTE WHERE idcliente = ?";
	    jdbcTemplate.update(sql, idcliente);	
	}	
	
}
