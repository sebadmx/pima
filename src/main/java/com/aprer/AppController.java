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

	@Autowired
	private CapacitacionesDAO daoCapacitaciones;	
	
	@Autowired
	private VisitasDAO daoVisitas;		
	
	@Autowired
	private AccidentesDAO daoAccidentes;	
	
	@Autowired
	private PlanesDAO daoPlanes;		
	
	
	@RequestMapping("/")
	public String Home(Model model) {
		return "index";
	}	
	
	@RequestMapping("/homecliente")
	public String HomeCliente(Model model) {
		
		List<Capacitacion> listCapacitacion = daoCapacitaciones.list();
		model.addAttribute("listCapacitacion",listCapacitacion);
			
		
		return "homecliente";
	}		
	
	@RequestMapping("/homeprofesional")
	public String HomeProfesional(Model model) {
		return "homeprofesional";
	}	
	@RequestMapping("/homeadmin")
	public String HomeAdmin(Model model) {
		return "homeadmin";
	}			
	
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
	
	@RequestMapping("/editar-eliminar-visitas")
	public String edElListVisitas(Model model) {
		
		List<Visitas> listVisitas = daoVisitas.list();
		model.addAttribute("listVisitas",listVisitas);
		return "ed_listavisitas";
		
	}

	@RequestMapping("/editar-eliminar-capacitacion")
	public String edElListCapacitacion(Model model) {
		
		List<Capacitacion> listCapacitacion = daoCapacitaciones.list();
		model.addAttribute("listCapacitacion",listCapacitacion);
		return "ed_listacapacitacion";
		
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
	@RequestMapping("/capacitacion")
	public String viewListCapacitacion(Model model) {
		
		List<Capacitacion> listCapacitacion = daoCapacitaciones.list();
		model.addAttribute("listCapacitacion",listCapacitacion);
		
		return "listacapacitacion";
	}		
	
	@RequestMapping("/plan")
	public String viewListPlan(Model model) {
		
		List<Plan> listPlan = daoPlanes.list();
		model.addAttribute("listPlan",listPlan);
		
		return "listaplan";
	}		
		
	@RequestMapping("/accidentes")
	public String viewListAccidentes(Model model) {
		
		List<Accidente> listAccidente = daoAccidentes.list();
		model.addAttribute("listAccidente",listAccidente);
		
		return "ed_listaaccidentes";
	}			
	
	/*Vista de crear*/
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
	
	@RequestMapping("/nuevacapacitacion")
	public String showNewFormCapacitacion(Model model) {
	    
		List<Profesional> listProfesional = daoProfesionales.list();
		model.addAttribute("listProfesional",listProfesional);
		
		List<Cliente> listCliente = daoClientes.list();
		model.addAttribute("listCliente",listCliente);		
		
		Capacitacion capacitacion = new Capacitacion();
	    model.addAttribute("capacitacion", capacitacion);
	    
	    
	    return "nuevocapacitacion";
	}	
	
	
	@RequestMapping("/nuevavisita")
	public String showNewFormVisita(Model model) {
	    
		List<Profesional> listProfesional = daoProfesionales.list();
		model.addAttribute("listProfesional",listProfesional);
		
		List<Cliente> listCliente = daoClientes.list();
		model.addAttribute("listCliente",listCliente);		
		
		Visitas visitas = new Visitas();
	    model.addAttribute("visitas", visitas);
	    
	    return "nuevavisita";
	}		
	
	@RequestMapping("/nuevoplan")
	public String showNewFormPlan(Model model) {
		
		Plan plan = new Plan();
	    model.addAttribute("plan", plan);
	    
	    return "nuevoplan";
	}		
	
	@RequestMapping("/reportaraccidente")
	public String showNewFormAccidente(Model model) {
		
		Accidente accidente = new Accidente();
	    model.addAttribute("accidente", accidente);
	    
	    return "nuevoaccidente";
	}			
	
	
	/*Vista de edicion*/	
	
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

	/*Funcion de Eliminar*/	
	
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

	@RequestMapping("/eliminarvisitas/{idvisitas}")
	public String deleteVisitas(@PathVariable(name = "idvisitas") int idvisitas) {
		daoVisitas.delete(idvisitas);
	    return "redirect:/editar-eliminar-visitas?eliminado";      
	}	
	
	@RequestMapping("/eliminaraccidentes/{idaccidentes}")
	public String deleteAccidentes(@PathVariable(name = "idaccidentes") int idaccidentes) {
		daoAccidentes.delete(idaccidentes);
	    return "redirect:/editar-eliminar-accidentes?eliminado";      
	}		
	
	@RequestMapping("/eliminarcapacitacion/{idcapacitacion}")
	public String deleteCapacitacion(@PathVariable(name = "idcapacitacion") int idcapacitacion) {
		daoAccidentes.delete(idcapacitacion);
	    return "redirect:/editar-eliminar-capacitacion?eliminado";      
	}		
		
	
	/*Funcion de Actualizar*/
	
	@RequestMapping(value = "/updateprofesional", method = RequestMethod.POST)
	public String update(@ModelAttribute("profesional") Profesional profesional) {
		daoProfesionales.update(profesional);
	      
	    return "redirect:/editar-eliminar-profesional?ok";
	}	
	
	/*Funcion de guardar*/
	
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
	@RequestMapping(value = "/savecapacitacion", method = RequestMethod.POST)
	public String saveCapacitacion(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
		daoCapacitaciones.save(capacitacion);
	    return "redirect:/editar-eliminar-capacitacion?ok";
	}	
	@RequestMapping(value = "/savevisita", method = RequestMethod.POST)
	public String saveVisitas(@ModelAttribute("visitas") Visitas visitas) {
		daoVisitas.save(visitas);
	    return "redirect:/editar-eliminar-visitas?ok";
	}		
	@RequestMapping(value = "/saveaccidente", method = RequestMethod.POST)
	public String saveAccidente(@ModelAttribute("accidente") Accidente accidente) {
		daoAccidentes.save(accidente);
	    return "redirect:/homecliente?incidente";
	}
	@RequestMapping(value = "/saveplan", method = RequestMethod.POST)
	public String savePlan(@ModelAttribute("plan") Plan plan) {
		daoPlanes.save(plan);
	    return "redirect:/plan";
	}	
}
