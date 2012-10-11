/**
 * This class authenicate the user so that each kind of user would have
 * different votes And this class will calculate the votes that the user still
 * can vote
 * 
 */


/*Constructor*/
public class Ballot {
	private Voter voter;
	private Projectdescription projectdescription;
	private Categories categories;
	private Ballotbox ballotBox;
/*Constructor*/
	public Ballot(Voter voter, Projectdescription project, Categories categories,Ballotbox ballotbox) {
		this.voter=voter;
		projectdescription = project;
		this.categories = categories;
		this.ballotBox=ballotbox;
	}
/*vote a score to Ballotbox*/
	public void vote() {
		ballotBox.addBallot(projectdescription.getNameProject());
	}


/*return categories*/	
	public Categories getCategories(){
		return categories;
	}
/*return projectdescription*/
	public Projectdescription getProjectdescription() {
		return projectdescription;
	}

}
