package edu.models;

public class Cgroup {
	private String nom;
	
	public Cgroup(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom;
	}
}
