package edu.models;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Ccontrat {
	private String code;
	private Date date;
	private CuserC user;
	
	public Ccontrat(CuserC userc) {
		super();
		this.code = UUID.randomUUID().toString();
		this.date = new Date();
		this.user =userc;
	}
	
	public String getCode() {return code;}
	public Date getDate() {return date;}
	public CuserC getUser() {return user;}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Contrat :[code : "+code+"; date : "+DateFormat.getDateInstance(DateFormat.FULL).format(this.date).toString()+";]";
	}
}
