package edu.test;

import edu.models.Capp;
import edu.models.CuserC;

public class testContrat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capp.create();
		CuserC user =new CuserC("bizute");
		user.addContrat();
		System.out.println(user);
		user.addToGroup("num 1");
		user.addToGroup("num 2");
		System.out.println(user);
	}
}
