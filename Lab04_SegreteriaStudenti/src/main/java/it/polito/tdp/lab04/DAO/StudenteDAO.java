package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {
	
	public List <Studente> getNomeCognome(Studente studente){
		
		final String sql=" SELECT nome,cognome " + 
				"FROM studente " + 
				"WHERE matricola=?";
		
		List <Studente> stud= new LinkedList<Studente>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1,studente.getMatricola());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				
				Studente s= new Studente (rs.getInt("matricola"),rs.getString("nome"), rs.getString("cognome"), rs.getString("CDS"));
				
				stud.add(s);
			}
			rs.close();
			conn.close();
			st.close();
					
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
			
		return stud;	
	}

}
