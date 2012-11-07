package controler;

import model.Project;
import GUI.GUIProject;
import user.*;

public class ControlLogin {
	private Voter people;
	private Project project;
	public ControlLogin(Project project) {
		this.project=project;
	}
	public void identfy(String name){
		if (Character.toString(name.charAt(0)).equals("2"))  people = new Student(name);	
		else if (Character.toString(name.charAt(0)).equals("5"))  people = new Commitee(name);
		else  people =  new Observer(name);
	}
	public void showProject(){
		GUIProject guiProject = new GUIProject(project);
	}

}
