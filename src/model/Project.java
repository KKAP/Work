package model;

import java.util.ArrayList;

import model.ProjectDescription;

public class Project {
	private ArrayList<ProjectDescription> project =null ;
	public void add(ProjectDescription project){
		if(this.project==null){
			this.project = new ArrayList<ProjectDescription>();
			this.project.add(project);
		}
		else this.project.add(project);
	}
	public ArrayList<ProjectDescription> getProject(){
		return project;
	}
}
