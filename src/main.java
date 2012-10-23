import GUI.*;
import user.*;
import model.*;
import controler.*;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	public static String a(){
		GUIlogin login =new GUIlogin();
		if(login.toString()!=null)
			return login.toString();
		return "2222";
	}
	public static void main(String[] args) {
		int count = 0;
		GUIvote guiVote = new GUIvote();
		Observer observer;
		Student student;
		Commitee commitee;
		Professor professor;
		Ballot ballot;
		Ballotbox ballotbox = new Ballotbox();
		Categories categories = new Categories("dddd");
		Project a1 = new Project("1", "1");
		Project a2 = new Project("2", "2");
		Project a3 = new Project("3", "3");
		Project a4 = new Project("4", "4");
		Project a5 = new Project("5", "5");
		Project a6 = new Project("6", "6");
		Controlresult controlResult = new  Controlresult(ballotbox);
		ControlVote controlVote =new ControlVote(ballotbox);
		//while (true) {

		a();
		//while(count<3)
		{
			//String b=a();
			guiVote = new GUIvote();
			guiVote.setShow(true);
			String in = "1111";
			{
				if (Character.toString(in.charAt(0)).equals("1")) {
					observer = new Observer();
					ballot = new Ballot(observer, a1, categories);
					guiVote.guiVote(ballot, controlVote);
				} else if (Character.toString(in.charAt(0)).equals("2")) {
					student = new Student("peach");
					ballot = new Ballot(student, a2, categories);

					guiVote.guiVote(ballot, controlVote);
				} else if (Character.toString(in.charAt(0)).equals("5")) {
					commitee = new Commitee();
					professor = new Professor();
					ballot = new Ballot(commitee, a4, categories);
					guiVote.guiVote(ballot, controlVote);
				}

			}





			sc.next();
			//	count++;
			controlResult.show();
		}


	}

}
