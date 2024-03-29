package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Cuser {
	private String nom;
	private String prenom;
	private int age;
	private List<Cgroup> groupes;
	private List<Cconnexion> connexions;
	private Cpreferences prefs;
	
	public Cuser(String nom) {
		super();
		this.nom = nom;
		this.prenom = "bla";
		this.age = 18;
		this.connexions =new ArrayList<Cconnexion>();
		this.groupes =new ArrayList<Cgroup>();
		this.prefs =Cpreferences.getDefault();
	}
	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public int getAge() {return age;}
	public void setAge(int age) {
		if (verifAge(age)) {
			this.age = age;
		}
	}
	
	public String afficher() {
		return "Nom : "+this.nom +"\nPr�nom : "+this.prenom;
	}
	
	/**
	 * @M�thode M�thode post connexion du user et ajoute une instance connexion a la liste
	 * @return Boolean -> true si ajout a la liste des connexions
	 */
	public Boolean postLogin() {
		try {
			return this.connexions.add(new Cconnexion(this));
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("ERROR ::: create connexion");
			return false;
		}
	}
	/**
	 * @M�thode M�thode qui liste les connexion
	 */
	public void listConnexion() {
		for (Cconnexion conn : this.connexions) {
			System.out.println(conn);
		}
	}
	/**
	 * @M�thode M�thode qui permet d'ajouter un groupe a un utilisateur
	 * @param group (String) -> nom du groupe
	 * @return Boolean -> true si ajouter au groupe
	 */
	public Boolean addToGroup(String groupName) {
		for (Cgroup group : Capp.instance.getListGroupes()) {
			if (group.getNom().equals(groupName) && !this.groupes.contains(group)) {
				this.groupes.add(group);
				return true;
			}
		}
		return false;
	}
	
	private Boolean verifAge(int age) {
		return (age>=0 && age <= 130);
	}

	@Override
	public String toString() {
		return "Nom : "+nom+";\nGroupe(s) :" +groupes+";\n"+prefs;
	}
}
