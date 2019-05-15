/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */

package parole;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import parole.model.Parole;

public class ParoleController {

	Parole elenco = new Parole();
		

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtParola"
	private TextField txtParola; // Value injected by FXMLLoader

	@FXML // fx:id="btnInserisci"
	private Button btnInserisci; // Value injected by FXMLLoader

	@FXML // fx:id="btnReset"
	private Button btnReset; // Value injected by FXMLLoader

	@FXML // fx:id="listView"
	private ListView listView; // Value injected by FXMLLoader
	
	@FXML // fx:id="btnReset"
	private Button btnRemove; // Value injected by FXMLLoader
	


	
	@FXML
	void doInsert(ActionEvent event) {
		listView.getItems().clear();
		
		elenco.addParola(txtParola.getText());
		txtParola.clear();
		
		listView.getItems().addAll(elenco.getElenco());
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
	}
	
	@FXML
	void doReset(ActionEvent event) {
		elenco.reset();
		listView.getItems().clear();
	}
	
	 @FXML
	 void doRemove(ActionEvent event) {
		 ObservableList selezionati;
		 selezionati=listView.getSelectionModel().getSelectedItems();
		 
		 for(Object o : selezionati) {
			 listView.getItems().remove(o);
			 elenco.elimina(o);
		 }
	    }

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
		assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";
		assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'Parole.fxml'.";
		 assert btnRemove != null : "fx:id=\"remove\" was not injected: check your FXML file 'Parole.fxml'.";

	}
}
