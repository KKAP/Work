package controler;

import user.*;

public class ControlLogin {
	//private Voter people;
	public Voter identfy(String name){

		if (Character.toString(name.charAt(0)).equals("2")) return new Student(name);	
		else if (Character.toString(name.charAt(0)).equals("5")) return new Commitee(name);
		return  new Observer(name);
	}

}
