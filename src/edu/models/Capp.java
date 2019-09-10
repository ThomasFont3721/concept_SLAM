package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Capp {
	
	public static Capp instance;
	private ArrayList<Cgroup> listGroupes;
	private ArrayList<Cuser> listUsers;
	
	public Capp() {
		super();
		this.listGroupes =new ArrayList<Cgroup>();
		this.listUsers =new ArrayList<Cuser>();
	}
	public List<Cgroup> getListGroupes() {
		return listGroupes;
	}
	public void setListGroupes(ArrayList<Cgroup> listGroupes) {
		this.listGroupes = listGroupes;
	}
	public List<Cuser> getListUsers() {
		return listUsers;
	}
	public void setListUsers(ArrayList<Cuser> listUsers) {
		this.listUsers = listUsers;
	}
	/**
	 * @Méthode Méthode qui rempli les listes
	 * @return Capp -> applicationn avec user et groupe
	 */
	public static Capp create() {
		instance = new Capp();
		instance.addUser("tomtom","nana");
		instance.addGroup("num 1", "num 2", "num 3");
		return instance;
	}
	/**
	 * @Méthode Méthode qui ajoute les users a la liste
	 * @param userNames (String[]) -> liste des noms
	 */
	private void addUser(String...userNames) {
		for (String name : userNames) {
			listUsers.add(new Cuser(name));
		}
	}
	/**
	 * @Méthode Méthode qui ajoute les groupes a la liste
	 * @param groupNames (String[]) -> liste des groupes
	 */
	private void addGroup(String...groupNames) {
		for (String name : groupNames) {
			listGroupes.add(new Cgroup(name));
		}
	}
	@Override
	public String toString() {
		return "Capp [listGroupes=" + listGroupes + ", listUsers=" + listUsers + "]";
	}
	
}
