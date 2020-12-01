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
public class CapacitacionesDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public CapacitacionesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Capacitacion> list(){
		//return null;
		String sql = "SELECT * FROM CAPACITACION";
		
		List<Capacitacion> listCapacitacion = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Capacitacion.class));
		
		return listCapacitacion;
	}
	
	public List<Capacitacion> list2(){
		//return null;
		String sql = "SELECT * FROM CAPACITACION";
		
		List<Capacitacion> listCapacitacion = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Capacitacion.class));
		
		return listCapacitacion;
	}	
	
	public void save(Capacitacion capacitacion) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("capacitacion").usingColumns("fechacapacitacion", "observacion", "cliente_idcliente", "profesional_idprofesional");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(capacitacion);
	    insertActor.execute(param);
	}
	
	public Capacitacion get(int idcapacitacion) {
	    String sql = "SELECT * FROM CAPACITACION WHERE idcapacitacion = ?";
	    Object[] args = {idcapacitacion};
	    Capacitacion capacitacion = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Capacitacion.class));
	    return capacitacion;
	}

	public void delete(int idcapacitacion) {
	    String sql = "DELETE FROM CAPACITACION WHERE idcapacitacion = ?";
	    jdbcTemplate.update(sql, idcapacitacion);	
	}	
	
}
