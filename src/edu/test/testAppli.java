package edu.test;


import edu.models.Capp;
import edu.models.Cuser;

public class testAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capp.create();
		Capp.instance.toString();
		Cuser user =Capp.instance.getListUsers().get(0);
		user.addToGroup("num 1");
		System.out.println(Capp.instance);
	}

}
