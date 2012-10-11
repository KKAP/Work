/**
 * This class authenicate the user so that each kind of user would have
 * different votes And this class will calculate the votes that the user still
 * can vote
 * 
 */

public class Ballot {
	private Voter voter;
	private Projectdescription projectdescription;
	private Categories categories;
	private BallotBox ballotBox;
	/**
	 * 
	 * @param voter which voter.
	 * @param project project description.
	 * @param categories what kind of categories.
	 * @param ballotbox ballotbox.
	 * this is a constructor class.
	 */
	public Ballot(Voter voter, Projectdescription project, Categories categories,BallotBox ballotbox) {
		this.voter=voter;
		projectdescription = project;
		this.categories = categories;
		this.ballotBox=ballotbox;
	}
	/**
	 * this method use to vote.
	 */
	public void vote() {
		ballotBox.addBallot(projectdescription.getNameProject());
	}


/**
 * 
 * @return a categories
 */


	public Categories getCategories(){
		return categories;
	}
/**
 * 
 * @return  projectdescription mean return a project description.
 */
	public Projectdescription getProjectdescription() {
		return projectdescription;
	}

}
