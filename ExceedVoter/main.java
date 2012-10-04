package ExceedVoter;

import java.util.Scanner;

public class main {
	static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		GUIvote guiVote ;
		Showresult showResult = new Showresult();
		Observer observer;
		Student student;
		Commitee commitee;
		Professor professor;
		Ballot ballot;
		Ballotbox ballotbox = new Ballotbox();
		Categories categories = new Categories("dddd");
		Projectdescrition a1 = new Projectdescrition("1", "1");
		Projectdescrition a2 = new Projectdescrition("2", "2");
		Projectdescrition a3 = new Projectdescrition("3", "3");
		Projectdescrition a4 = new Projectdescrition("4", "4");
		Projectdescrition a5 = new Projectdescrition("5", "5");
		Projectdescrition a6 = new Projectdescrition("6", "6");

		while(true){
			guiVote = new GUIvote();
			guiVote.setShow(true);
			String in = sc.nextLine();
			{
				if(Character.toString(in.charAt(0)).equals("1")){
					observer = new Observer();
					ballot=new Ballot(observer, a1, categories);
					guiVote.guiVote(ballot, ballotbox) ;
				}
				else if(Character.toString(in.charAt(0)).equals("2")){
					student = new Student("peach");
					ballot=new Ballot(student, a2, categories);
				
					guiVote.guiVote(ballot, ballotbox) ;
				}
				else if(Character.toString(in.charAt(0)).equals("5")){
					commitee = new Commitee();
					professor = new Professor();
					ballot=new Ballot(commitee, a4, categories);
					guiVote.guiVote(ballot, ballotbox) ;
				}
				
			}
			guiVote.setShow(false);
			count++;
			if(count==5)
				break;
			



		}
		showResult.show(ballotbox);



	}
}
