package beans;

import java.util.LinkedList;

import constantes.Constantes;
import csv.CSVReader;

public class Personne {

	private String[] nom_genre;
	private int numRue;
	private String[] adresse_ville;
	private int age;
	private LinkedList<String> whatItDid = new LinkedList<String>();
	
	public Personne() {
		nom_genre = CSVReader.getRandomLineCSV(Constantes.FILENAME_PRENOM, Constantes.SEPARATOR_PRENOM, Constantes.MAX_LINES_PRENOM);
		nom_genre[0] = nom_genre[0].substring(0, 1).toUpperCase() + nom_genre[0].substring(1, nom_genre[0].length());
		adresse_ville = CSVReader.getRandomLineCSV(Constantes.FILENAME_VILLE_RUE, Constantes.SEPARATOR_VILLE_RUE, Constantes.MAX_LINES_VILLE_RUE);
		age = (int) (Math.random() * 99) + 2 ;
		numRue = (int) (Math.random()*1000) +1;
		whatItDid.add("a fait caca sur la plage");
	}
	
	public String toString() {
		String str = "";
		System.out.println(nom_genre[0]);
		System.out.println(numRue+" "+adresse_ville[0]+"\n"+adresse_ville[1]);
		System.out.println("Age : "+age);
		System.out.println("Ce que j'ai fait : ");
		for (String string : whatItDid) {
			System.out.println("- "+string);
		}
		return str;
	}

	public String[] getNom() {
		return nom_genre;
	}

	public void setNom_genre(String[] nom_genre) {
		this.nom_genre = nom_genre;
	}

	public String[] getAdresse_ville() {
		return adresse_ville;
	}

	public void setAdresse_ville(String[] adresse_ville) {
		this.adresse_ville = adresse_ville;
	}

	public LinkedList<String> getWhatItDid() {
		return whatItDid;
	}

	public void setWhatItDid(LinkedList<String> whatItDid) {
		this.whatItDid = whatItDid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	
}
