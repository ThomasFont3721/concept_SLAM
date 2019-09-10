package edu.models;

import java.util.HashMap;
import java.util.Map;

public class Cpreferences {
	private Map<String, Object> prefs;

	public Cpreferences() {
		super();
		this.prefs = new HashMap<String, Object>();
	}


	public Object getPrefs(String key) {
		return prefs.get(key);
	}

	public void setPrefs(String key,Object object) {
		this.prefs.put(key, object);
	}
	
	public Boolean exist(String key) {
		return this.prefs.containsKey(key);
	}
	
	public static Cpreferences getDefault() {
		Cpreferences pref =new Cpreferences();
		pref.setPrefs("admin",true);
		pref.setPrefs("bgcolor","black");
		return pref;
	}
	@Override
	public String toString() {
		return "Preferences : "+prefs;
	}
}
