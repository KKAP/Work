package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controler.ControlProject;

import model.Project;
import model.ProjectDescription;

public class GUIProject {
	private ControlProject controlProject = new ControlProject();
	public GUIProject(final Project project){
		final JFrame f = new JFrame("Project");
		f.setSize(800,600);
		JButton[] project1= new JButton[project.getProject().size()];
		f.setLayout(new GridLayout(0,4));
		for(int i=0;i<project.getProject().size();i++){
			project1[i] = new JButton(project.getProject().get(i).getName());
			f.add(project1[i]);
			final int b=i;
			project1[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent a) {
					controlProject.show(project, b);
				}
			});
		}

		f.setVisible(true);

	}
//	public static void main(String[] args) {
//		ProjectDescription a = new ProjectDescription("1", "0");
//		ProjectDescription b = new ProjectDescription("2", "0");
//		ProjectDescription c = new ProjectDescription("3", "0");
//		ProjectDescription d = new ProjectDescription("4", "0");
//		ProjectDescription e = new ProjectDescription("5", "0");
//		ProjectDescription f = new ProjectDescription("6", "0");
//		ProjectDescription g = new ProjectDescription("7", "0");
//		ProjectDescription h = new ProjectDescription("8", "0");
//		ProjectDescription i = new ProjectDescription("9", "0");
//		ProjectDescription j = new ProjectDescription("10", "0");
//		ProjectDescription k = new ProjectDescription("11", "0");
//		Project z = new Project();
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
