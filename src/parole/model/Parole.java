package parole.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Parole {
	
	ListView<String> list = new ListView<String>();
	ObservableList<String> items =FXCollections.observableArrayList();
	
	public Parole() {
	}
	
	public void addParola(String p) {
		
		items.add(p);
		list.setItems(items);
	}
	
	public ListView<String> getElenco() {
		
		return list;
	}
	
	public void reset() {
		items.clear();
		list.setItems(items);
	}
	
	public void elimina(String p) {
		
	}

	@Override
	public String toString() {
		return "Parole [list=" + list + ", items=" + items + "]";
	}

	public ObservableList<String> getItems() {
		return items;
	}
	
	
	

}
