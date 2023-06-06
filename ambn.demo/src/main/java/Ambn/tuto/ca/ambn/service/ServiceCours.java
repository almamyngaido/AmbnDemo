package Ambn.tuto.ca.ambn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Ambn.tuto.ca.ambn.beans.Cours;
import Ambn.tuto.ca.ambn.repository.RepositoryCours;

@Service
public class ServiceCours {
	
	public RepositoryCours subRepo;
	
	public List<Cours> getAllCours(){
		List<Cours> Cours = new ArrayList<>();
		subRepo.findAll().forEach(Cours::add );
		return Cours;
		
		
		
	}

	public void ajouterCours(Cours cours) {
		subRepo.save(cours);
		
		
	}

	public void updateCours(String id , Cours cours) {
		subRepo.save(cours);
		
		
	}

	public void deleteCours(String id, Cours cours) {
		
		subRepo.deleteById(id);
	}
	
	

}
