package com.aprer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private ProfesionalesDAO daoProfesionales;	
	
	@Autowired
	private ClientesDAO daoClientes;	
	
	@Autowired
	private RubrosDAO daoRubros;	
		
	
	@RequestMapping("/editar-eliminar-profesional")
	public String edElListProfesional(Model model) {
		List<Profesional> listProfesional = daoProfesionales.list();
		model.addAttribute("listProfesional",listProfesional);
		return "ed_listaprofesionales";
	}
	
	@RequestMapping("/editar-eliminar-cliente")
	public String edElListCliente(Model model) {
		
		List<Cliente> listCliente = daoClientes.list();
		model.addAttribute("listCliente",listCliente);
		return "ed_listaclientes";
		
	}	
	
	@RequestMapping("/profesional")
	public String viewListProfesional(Model model) {
		List<Profesional> listProfesional = daoProfesionales.list();
		model.addAttribute("listProfesional",listProfesional);
		return "listaprofesionales";
	}
	@RequestMapping("/cliente")
	public String viewListCliente(Model model) {
		List<Cliente> listCliente = daoClientes.list();
		model.addAttribute("listCliente",listCliente);
		return "listaclientes";
	}		
	
	@RequestMapping("/nuevoprofesional")
	public String showNewFormProfesional(Model model) {
	    Profesional profesional = new Profesional();
	    model.addAttribute("profesional", profesional);
	    return "nuevoprofesional";
	}
	
	@RequestMapping("/nuevocliente")
	public String showNewFormCliente(Model model) {
	    
		List<Rubro> listRubro = daoRubros.list();
		model.addAttribute("listRubro",listRubro);
		
		Cliente cliente = new Cliente();
	    model.addAttribute("cliente", cliente);
	    
	    
	    return "nuevocliente";
	}	
	
	@RequestMapping("/editarprofesional/{idprofesional}")
	public ModelAndView showEditProfesionalForm(@PathVariable(name = "idprofesional") int idprofesional) {
	    ModelAndView mav = new ModelAndView("editarprofesional");
	    Profesional profesional = daoProfesionales.get(idprofesional);
	    mav.addObject("profesional", profesional);
	    return mav;
	}	
	
	@RequestMapping("/editarcliente/{idcliente}")
	public ModelAndView showEditClienteForm(@PathVariable(name = "idcliente") int idcliente) {
	    ModelAndView mav = new ModelAndView("editarcliente");
	    Cliente cliente = daoClientes.get(idcliente);
	    mav.addObject("cliente", cliente);
	    return mav;
	}		
	
	@RequestMapping("/eliminarprofesional/{idprofesional}")
	public String deleteProfesional(@PathVariable(name = "idprofesional") int idprofesional) {
		daoProfesionales.delete(idprofesional);
	    return "redirect:/editar-eliminar-profesional?eliminado";      
	}
	
	@RequestMapping("/eliminarcliente/{idcliente}")
	public String deleteCliente(@PathVariable(name = "idcliente") int idcliente) {
		daoClientes.delete(idcliente);
	    return "redirect:/editar-eliminar-cliente?eliminado";      
	}	
	
	@RequestMapping(value = "/updateprofesional", method = RequestMethod.POST)
	public String update(@ModelAttribute("profesional") Profesional profesional) {
		daoProfesionales.update(profesional);
	      
	    return "redirect:/editar-eliminar-profesional?ok";
	}	
	@RequestMapping(value = "/saveprofesional", method = RequestMethod.POST)
	public String saveProfesional(@ModelAttribute("profesional") Profesional profesional) {
		daoProfesionales.save(profesional);
	    return "redirect:/editar-eliminar-profesional?ok";
	}
	@RequestMapping(value = "/savecliente", method = RequestMethod.POST)
	public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
		daoClientes.save(cliente);
	    return "redirect:/editar-eliminar-cliente?ok";
	}	
}
