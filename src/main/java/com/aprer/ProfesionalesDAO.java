package com.aprer;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("profesional").usingColumns("nombre", "appaterno", "apmaterno", "rut", "dv", "fechanacimiento", "profesion", "direccion", "telefono", "email", "cargo");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(profesional);
	    insertActor.execute(param);
	}
	
	public Profesional get(int idprofesional) {
	    String sql = "SELECT * FROM PROFESIONAL WHERE idprofesional = ?";
	    Object[] args = {idprofesional};
	    Profesional profesional = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Profesional.class));
	    return profesional;
	}

	public void update(Profesional profesional) {
	    String sql = "UPDATE PROFESIONAL SET PROFESIONAL.NOMBRE=:nombre, PROFESIONAL.APPATERNO=:appaterno, PROFESIONAL.APMATERNO=:apmaterno, PROFESIONAL.RUT=:rut, PROFESIONAL.DV=:dv, PROFESIONAL.FECHANACIMIENTO=:fechanacimiento, PROFESIONAL.PROFESION=:profesion, PROFESIONAL.DIRECCION=:direccion, PROFESIONAL.TELEFONO=:telefono, PROFESIONAL.EMAIL=:email, PROFESIONAL.CARGO=:cargo WHERE PROFESIONAL.IDPROFESIONAL=:idprofesional";
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(profesional);
	 
	    NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
	    template.update(sql, param);   		
	}
	public void delete(int idprofesional) {
	    String sql = "DELETE FROM PROFESIONAL WHERE idprofesional = ?";
	    jdbcTemplate.update(sql, idprofesional);	
	}
}
