
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

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
		while (true) {
			GUIlogin login =new GUIlogin();
			
			System.out.println(login.toString());
			if (count == 5)
				break;
			guiVote.setShow(true);
			guiVote = new GUIvote();
			//guiVote.setShow(true);
			//String in = sc.nextLine();
			{
				if (Character.toString(login.toString().charAt(0)).equals("1")) {
					observer = new Observer();
				//	while(observer.getRemainning()>=0)
					
					ballot = new Ballot(observer, a1, categories,ballotbox);
					guiVote.guiVote(ballot);
					
					
				} else if (Character.toString(login.toString().charAt(0)).equals("2")) {
					student = new Student("peach");
					//while(student.getRemainning()>=0)
					{
					ballot = new Ballot(student, a2, categories,ballotbox);
					guiVote.guiVote(ballot);
					}
				} else if (Character.toString(login.toString().charAt(0)).equals("5")) {
					commitee = new Commitee();
					professor = new Professor();
					//while(commitee.getRemainning()>=0)
					{
					ballot = new Ballot(commitee, a4, categories,ballotbox);
					guiVote.guiVote(ballot);
					}
				}


			}
			guiVote.setShow(false);
			
			
			count++;

		}
		controlResult.show();

	}

}
