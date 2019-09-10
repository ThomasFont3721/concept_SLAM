package edu.test;

import edu.models.Cgroup;
import edu.models.Cuser;

public class TestUser {
	public static void main(String[] args) {
		Cuser user = new Cuser("fontaine");
		System.out.println(user.afficher());
		System.out.println(user);
		user.postLogin();
		user.listConnexion();
		Cgroup groupe = new Cgroup("number 1");
		user.addToGroup(groupe.getNom());
		/*Integer j =0;
		while (j<10) {
			System.out.print(j);
			j++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}*/
	}
}
