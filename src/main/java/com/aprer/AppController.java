package com.aprer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	private SalesDAO dao2;
	
	@Autowired
	private ProfesionalesDAO daoListProfesionales;	
	
	@RequestMapping("/")
	public String viewHomePage2(Model model) {
		
		List<Sale> listSale = dao2.list();
		model.addAttribute("listSale",listSale);
		return "index";
		
	}	
	
	@RequestMapping("/profesional")
	public String viewListProfesional(Model model) {
		
		List<Profesional> listProfesional = daoListProfesionales.list();
		model.addAttribute("listProfesional",listProfesional);
		return "listaprofesionales";
		
	}
	
	
}
