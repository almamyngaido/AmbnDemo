package Ambn.tuto.ca.ambn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Ambn.tuto.ca.ambn.beans.Cours;
import Ambn.tuto.ca.ambn.service.ServiceCours;

@RestController
public class CoursController {
	@Autowired

	private ServiceCours serviceCours;
	
	@RequestMapping("/cours")
	
	public List<Cours> getAllCours(){
		return serviceCours.getAllCours();
		
		
		
	}
	@RequestMapping(method= RequestMethod.POST, value="/cours")
	public void ajouterCours(@RequestBody Cours cours)
	{
		serviceCours.ajouterCours(cours);
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/cours/{id}")
	public void updateCours(@PathVariable String id, @RequestBody Cours cours) {
	serviceCours.updateCours(id, cours);
		
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/cours/{id}")
	public void DeleteCours(@PathVariable String id, @RequestBody Cours cours) {
	serviceCours.deleteCours(id, cours);
		
		
	}

}
