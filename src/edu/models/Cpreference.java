package edu.models;

import java.util.Arrays;
import java.util.List;

public class Cpreference {
	private String nom;
	private Object valeur;
	
	public Cpreference(String nom, Object valeur) {
		super();
		this.nom = nom;
		this.valeur = valeur;
	}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public Object getValeur() {return valeur;}
	public void setValeur(String valeur) {this.valeur = valeur;}
	
	/**
	 * @author Thomas
	 * @Méthode Création d'une liste de préférence par defaut
	 * @return List<Cpreference> -> liste des valeurs par defaut
	 */
	public static List<Cpreference> getDefault(){
		return Arrays.asList(new Cpreference("admin", true),new Cpreference("bgcolor", "black"));
	}
}
