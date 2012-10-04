/*
 * This class will create a projectdescition object and each one of them will store the project.
 */

import java.awt.List;
import java.util.ArrayList;

public class Projectdescription {

	private String nameProject;
	private String descrition;

	public Projectdescription(String name, String description) {
		nameProject = name;
		this.descrition = description;
	}

	public void addDescrition(String descrition) {
		this.descrition = descrition;
	}

	public void addNameProject(String name) {
		this.nameProject = name;
	}

	public String getNameProject() {
		return nameProject;
	}

	public String getDescrition() {
		return descrition;

	}

}
