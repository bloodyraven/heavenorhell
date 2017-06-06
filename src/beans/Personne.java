package beans;

import java.util.LinkedList;

public class Personne {

	private String nom;
	private String adresse;
	private LinkedList<String> whatItDid;
	
	public Personne() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LinkedList<String> getWhatItDid() {
		return whatItDid;
	}

	public void setWhatItDid(LinkedList<String> whatItDid) {
		this.whatItDid = whatItDid;
	}
}
