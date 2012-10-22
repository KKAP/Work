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
	private Ballotbox ballotBox;

	/**
	 * 
	 * @param voter which voter.
	 * @param project project description.
	 * @param categories what kind of categories.
	 * @param ballotbox ballotbox.
	 * this is a constructor class.
	 */
	public Ballot(Voter voter, Project project, Categories categories,Ballotbox ballotbox ){
		this.voter=voter;
		projectdescription = project;
		this.categories = categories;
		this.ballotBox=ballotbox;
	}
//	/**
//	 * this method use to vote.
//	 */
//	public void vote() {
//		ballotBox.addBallot(projectdescription.getName());
//	}


	public Categories getCategories(){
		return categories;
	}

	public Project getProjectdescription() {
		return projectdescription;
	}

}
