package beans;

import java.util.ArrayList;

public class Joueur {

	private ArrayList<Personne> heavenList;
	private ArrayList<Personne> hellList;
	
	public Joueur() {
		setHeavenList(new ArrayList<Personne>());
		setHellList(new ArrayList<Personne>());
	}

	public void addPersonneToHeaven(Personne p) {
		heavenList.add(p);
	}
	
	public void addPersonneToHell(Personne p) {
		hellList.add(p);
	}
	
	public ArrayList<Personne> getHeavenList() {
		return heavenList;
	}

	public void setHeavenList(ArrayList<Personne> heavenList) {
		this.heavenList = heavenList;
	}

	public ArrayList<Personne> getHellList() {
		return hellList;
	}

	public void setHellList(ArrayList<Personne> hellList) {
		this.hellList = hellList;
	}
}
