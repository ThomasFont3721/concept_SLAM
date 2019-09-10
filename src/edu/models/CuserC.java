package edu.models;

public class CuserC extends Cuser {
	private Ccontrat contrat;

	public CuserC(String nom) {
		super(nom);
	}

	public Ccontrat getContrat() {return contrat;}
	public void addContrat() {this.contrat = new Ccontrat(this);}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+contrat;
	}
}
