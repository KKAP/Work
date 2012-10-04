/**
 * This class authenicate the user so that each kind of user would have different votes
 * And this class will calculate the votes that the user still can vote
 *
 */


public class Ballot {
	private int remaining ;
	private Projectdescrition projectdescrition;
	private Categories categories;
	
	public Ballot(Voter voter,Projectdescrition project,Categories categories) {

		if(voter instanceof Student)
			remaining= 2;
		else if(voter instanceof Observer)
			remaining= 1;
		else
			remaining=5;
		projectdescrition=project;
		this.categories=categories;
	}
	public void vote(Ballotbox ballotbox) {
		if(remaining>0){
			ballotbox.addBallot(projectdescrition.getNameProject());
			remaining--;
		}
		else if(remaining == 0)
		{
			System.out.println("You don't have any votes left!!!");
		}
	}

	// i think this method is very hard for my group. And i think we should not do it
	
	public int getRemaining() {
		return remaining;
	}
	public Projectdescrition getProjectdescrition(){
		return projectdescrition;
	}



}
