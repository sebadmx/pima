package com.aprer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class ProfesionalesDAOTest {

	private ProfesionalesDAO dao;
	
	@Before
	public void setUp() throws Exception {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		datasource.setUsername("aprer");
		datasource.setPassword("123");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new ProfesionalesDAO(new JdbcTemplate(datasource));
		
	}

	@Test
	public void testList() {
		
		List<Profesional> listProfesional =  dao.list();
		assertTrue(listProfesional.isEmpty());
		
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
