package edu.models;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

public class Cconnexion {
	private Date date;
	private String ip;
	private Cuser user;

	public Date getDate() {return date;}
	public void setDate(Date date) {this.date = date;}
	public String getIp() {return ip;}
	public void setIp(String ip) {this.ip = ip;}
	public Cuser getUser() {return user;}
	public void setUser(Cuser user) {this.user = user;}
	
	public Cconnexion(Cuser user) throws UnknownHostException {
		super();
		this.date = new Date();
		this.ip = InetAddress.getLocalHost().toString();
		this.user = user;
	}
	
	@Override
	public String toString() {
		return DateFormat.getDateInstance(DateFormat.FULL).format(this.date).toString()+" ::: "+this.ip ;
	}
}
