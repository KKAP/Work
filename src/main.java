
import GUI.*;
import user.*;
import model.*;
import controler.*;
import java.util.Scanner;

import GUI.*;
import user.*;
import model.*;
import controler.*;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static private GUIlogin login;
	

	public static void main(String[] args) {
		//GUIvote guiVote = new GUIvote() ;
		Observer observer;
		Student student;
		Commitee commitee;
		Professor professor;
		Ballot ballot;
		Ballotbox ballotbox = new Ballotbox();
		ProjectDescription a1 = new ProjectDescription("1", "1");
		ProjectDescription a2 = new ProjectDescription("2", "2");
		ProjectDescription a3 = new ProjectDescription("3", "3");
		ProjectDescription a4 = new ProjectDescription("4", "4");
		ProjectDescription a5 = new ProjectDescription("5", "5");
		ProjectDescription a6 = new ProjectDescription("6", "6");
		Project project = new Project();
		project.add(a1);
		project.add(a2);
		project.add(a3);
		project.add(a4);
		project.add(a5);
		project.add(a6);
		Controlresult controlResult = new Controlresult(ballotbox);
		ControlVote controlVote = new ControlVote(ballotbox);
		login = new GUIlogin(new ControlLogin(project));

		//		String in = login.toString();
		//		{
		//			if (Character.toString(in.charAt(0)).equals("1")) {
		//				observer = new Observer(in);
		//				ballot = new Ballot(observer, a1, categories);
		//				guiVote.guiVote(ballot, controlVote);
		//			} else if (Character.toString(in.charAt(0)).equals("2")) {
		//				student = new Student("peach");
		//				ballot = new Ballot(student, a2, categories);
		//
		//				guiVote.guiVote(ballot, controlVote);
		//			} else if (Character.toString(in.charAt(0)).equals("5")) {
		//				commitee = new Commitee(in);
		//				ballot = new Ballot(commitee, a4, categories);
		//				guiVote.guiVote(ballot, controlVote);
		//			}
		//		}
		

		//controlResult.show();
	}
}


