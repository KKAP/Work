/**
 * This class authenicate the user so that each kind of user would have
 * different votes And this class will calculate the votes that the user still
 * can vote
 * 
 */

public class Ballot {
	private Voter voter;
	private Project projectdescription;
	private Categories categories;
	private BallotBox ballotBox;

	public Ballot(Voter voter, Project project, Categories categories,BallotBox ballotbox) {
		this.voter=voter;
		projectdescription = project;
		this.categories = categories;
		this.ballotBox=ballotbox;
	}

	public void vote() {
		ballotBox.add(projectdescription.getName());
	}

	public Categories getCategories(){
		return categories;
	}

	public Project getProjectdescription() {
		return projectdescription;
	}

}
