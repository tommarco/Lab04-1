package it.polito.tdp.lab04;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Model;
import it.polito.tdp.lab04.model.Studente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboCorsi;

    @FXML
    private TextField txtMatricola;

    @FXML
    private TextField txtCognome;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void handleCercaCorsi(ActionEvent event) {

    }

    @FXML
    void handleIscrittiCorso(ActionEvent event) {

    }

    @FXML
    void handleIscrivi(ActionEvent event) {

    }

    @FXML
    void handleReset(ActionEvent event) {

    }

    @FXML
    void handlecheck(ActionEvent event) {
    	
    	
    	String matricola= txtMatricola.getText();
    	
    	
    	
    		for(Studente s: this.model.getNomeCognome(Integer.parseInt(matricola))) {
    			
    				txtCognome.setText(s.getCognome().toString());
    				txtNome.setText(s.getNome().toString());
    				
    			
    			}
    		
    		
    		
    		
    	}
    	
    	
    		
    	

    

    @FXML
    void initialize() {
        assert comboCorsi != null : "fx:id=\"comboCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setModel(Model model) {
   	 
   	 comboCorsi.getItems().add("");
       	
   	 for(Corso c: model.getTuttiICorsi()) {
   		 
   		 comboCorsi.getItems().add(c.getNome());
   		 
   	 }
   	
       	this.model= model;
       }
}
