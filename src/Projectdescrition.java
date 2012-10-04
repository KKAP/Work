

import java.awt.List;
import java.util.ArrayList;

public class Projectdescrition {

	private String nameProject;
	private String descrition;
	public Projectdescrition(String name,String descrition) {
		nameProject=name;
		this.descrition=descrition;
	}
	
	public void addDescrition(String descrition){
		this.descrition=descrition;
	}
	
	public void addNameProject(String name){
		this.nameProject=name;
	}
	
	public String getNameProject(){
		return nameProject;
	}

	public String getDescrition() {
		return descrition;

	}

}
