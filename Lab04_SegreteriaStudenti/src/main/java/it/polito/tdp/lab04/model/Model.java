package it.polito.tdp.lab04.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	
	private CorsoDAO corsoDao;
	private StudenteDAO studenteDao;
	
	
	public Model() {
		
		corsoDao= new CorsoDAO();
		studenteDao= new StudenteDAO();
		
	}
	
	public List<Corso> getTuttiICorsi() {
		
		
		return corsoDao.getTuttiICorsi();
		
	}
	
	public List <Studente> getNomeCognome(int matricola){
		
		
		return studenteDao.getNomeCognome(new Studente(matricola,null,null,null));
	}

}
