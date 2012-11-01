package GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Project;

public class GUIProject {

	public GUIProject(Project project){
		JFrame f = new JFrame("Project");
		f.setSize(800,600);
		JButton project1 = new JButton(project.getName());
		JButton project2 = new JButton(project.getName());
		JButton project3 = new JButton(project.getName());
		JButton project4 = new JButton(project.getName());
		JButton project5 = new JButton(project.getName());
		JButton project6 = new JButton(project.getName());
		JButton project7 = new JButton(project.getName());
		
		JButton project8 = new JButton(project.getName());
		JButton project9 = new JButton(project.getName());
		JButton project10 = new JButton(project.getName());
		JButton project11 = new JButton(project.getName());
		JButton project12 = new JButton(project.getName());
		f.setLayout(new GridLayout(0,4));
		f.add(project1);
		f.add(project2);
		f.add(project3);
		f.add(project4);
		f.add(project5);
		f.add(project6);
		f.add(project7);
		f.add(project8);
		f.add(project9);
		f.add(project10);
		f.add(project11);
		f.add(project12);
		f.setVisible(true);
			
	}
	public static void main(String[] args) {
		Project a = new Project("peach", "description");
		GUIProject b = new GUIProject(a);
	}
}
