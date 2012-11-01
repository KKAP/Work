package GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Project;
import model.ProjectDescription;

public class GUIProject {

	public GUIProject(Project project){
		JFrame f = new JFrame("Project");
		f.setSize(800,600);
		JButton[] project1= new JButton[project.getProject().size()];
		f.setLayout(new GridLayout(0,4));
		for(int i=0;i<project.getProject().size();i++){
			project1[i] = new JButton(project.getProject().get(i).getName());
			f.add(project1[i]);
		}
		
		f.setVisible(true);
			
	}
//	public static void main(String[] args) {
//		Project a = new Project("1", "0");
//		Project b = new Project("2", "0");
//		Project c = new Project("3", "0");
//		Project d = new Project("4", "0");
//		Project e = new Project("5", "0");
//		Project f = new Project("6", "0");
//		Project g = new Project("7", "0");
//		Project h = new Project("8", "0");
//		Project i = new Project("9", "0");
//		Project j = new Project("10", "0");
//		Project k = new Project("11", "0");
//		AllProject z = new AllProject();
//		z.add(a);
//		z.add(b);
//		z.add(c);
//		z.add(d);
//		z.add(e);
//		z.add(f);
//		z.add(g);
//		z.add(h);
//		z.add(i);
//		z.add(j);
//		z.add(k);
//		GUIProject zzz = new GUIProject(z);
//		
//	}
	
}
