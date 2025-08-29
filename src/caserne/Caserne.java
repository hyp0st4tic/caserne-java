package caserne;

import java.util.*;

public class Caserne {
	
	private String nom;
	private List<Personnel> lesPersonnels;
	
	public Caserne(String nom) {
		this.nom = nom;
		lesPersonnels=new ArrayList<>();
	}
	
	public boolean affecter(Personnel membre) {
		if(lesPersonnels.add(membre)) {			
			membre.setCaserne(this);
			return true;
		}else {			
			return false;
		}
	}
	
	public int affecter(List<Personnel> membres) {
		int compteur = 0;
		for(Personnel p: membres) {
			if(affecter(p)) {
				compteur++;
			}
		}
		return compteur;
	}

}

