package parole.model;

import java.util.ArrayList;
import java.util.Collections;

public class Parole {
	
	ArrayList<String> list = new ArrayList<String>();
	
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		list.add(p);
		Collections.sort(list);
	}
	
	public ArrayList<String> getElenco() {
		
		return list;
	}
	
	public void reset() {
		list.clear();
	}
	
	public void elimina(Object o) {
		list.remove(o);
	}

	
	
	

}
