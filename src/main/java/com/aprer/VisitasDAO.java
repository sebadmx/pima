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
public class VisitasDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public VisitasDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Visitas> list(){

		String sql = "SELECT * FROM VISITAS";
		
		List<Visitas> listVisitas = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Visitas.class));
		
		return listVisitas;
	}
	
	public void save(Visitas visitas) {
	    SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("visitas").usingColumns("fechavisita", "detalle", "observacion", "cliente_idcliente", "profesional_idprofesional", "coordenadas");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(visitas);
	    insertActor.execute(param);
	}		
	
	public Visitas get(int idvisitas) {
	    String sql = "SELECT * FROM VISITAS WHERE idvisitas = ?";
	    Object[] args = {idvisitas};
	    Visitas visitas = jdbcTemplate.queryForObject(sql, args,BeanPropertyRowMapper.newInstance(Visitas.class));
	    return visitas;
	}	
	
	public void delete(int idvisitas) {
	    String sql = "DELETE FROM VISITAS WHERE idvisitas = ?";
	    jdbcTemplate.update(sql, idvisitas);	
	}	
	
}
