/**
 * This class authenicate the user so that each kind of user would have
 * different votes And this class will calculate the votes that the user still
 * can vote
 * 
 */

public class Ballot {
	private int remaining;
	private Projectdescription projectdescription;
	private Categories categories;

	public Ballot(Voter voter, Projectdescription project, Categories categories) {

		if (voter instanceof Student)
			remaining = 2;
		else if (voter instanceof Observer)
			remaining = 1;
		else
			remaining = 5;
		projectdescription = project;
		this.categories = categories;
	}

	public void vote(Ballotbox ballotbox) {
		if (remaining > 0) {
			ballotbox.addBallot(projectdescription.getNameProject());
			remaining--;
		} else if (remaining == 0) {
			System.out.println("You don't have any votes left!!!");
		}
	}

	// i think this method is very hard for my group. And i think we should not
	// do it

	public int getRemaining() {
		return remaining;
	}

	public Projectdescription getProjectdescription() {
		return projectdescription;
	}

}
