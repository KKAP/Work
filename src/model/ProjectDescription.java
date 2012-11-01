package model;
/*
 * This class will create a projectdescition object and each one of them will store the project.
 */

public class ProjectDescription {

	private String name;
	private String description;

	public ProjectDescription(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;

	}
	
	public String toString() {
		return name;
	}

}
