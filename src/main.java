
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
		Projectdescription a1 = new Projectdescription("1", "1");
		Projectdescription a2 = new Projectdescription("2", "2");
		Projectdescription a3 = new Projectdescription("3", "3");
		Projectdescription a4 = new Projectdescription("4", "4");
		Projectdescription a5 = new Projectdescription("5", "5");
		Projectdescription a6 = new Projectdescription("6", "6");
		Controlresult controlResult = new  Controlresult(ballotbox);
		while (true) {
			if (count == 5)
				break;
			guiVote = new GUIvote();
			guiVote.setShow(true);
			String in = sc.nextLine();
			{
				if (Character.toString(in.charAt(0)).equals("1")) {
					observer = new Observer();
				//	while(observer.getRemainning()>=0)
					{
					ballot = new Ballot(observer, a1, categories,ballotbox);
					guiVote.guiVote(ballot);
					}
					
				} else if (Character.toString(in.charAt(0)).equals("2")) {
					student = new Student("peach");
					//while(student.getRemainning()>=0)
					{
					ballot = new Ballot(student, a2, categories,ballotbox);
					guiVote.guiVote(ballot);
					}
				} else if (Character.toString(in.charAt(0)).equals("5")) {
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
