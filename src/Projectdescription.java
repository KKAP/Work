/*
 * This class will create a projectdescition object and each one of them will store the project.
 */

import java.awt.List;
import java.util.ArrayList;

public class Projectdescription {

	private String nameProject;
	private String descrition;
	
	/**
	 * @param name constructor a name of nameProject.
	 * @param description constructor a description name.
	 */
	public Projectdescription(String name, String description) {
		nameProject = name;
		this.descrition = description;
	}
	/**
	 * 
	 * @param descrition 
	 */
	public void addDescrition(String descrition) {
		this.descrition = descrition;
	}
	/**
	 * 
	 * @param name 
	 */
	public void addNameProject(String name) {
		this.nameProject = name;
	}
	/**
	 * @return a name of the project.
	 */
	public String getNameProject() {
		return nameProject;
	}
	/**
	 * 
	 * @return a discription
	 */
	public String getDescrition() {
		return descrition;

	}

}
