package controler;
import model.*;
public class ControlVote {

	private Ballotbox ballotbox;

	public ControlVote(Ballotbox ballotbox) {
		this.ballotbox = ballotbox;
	}
	public void add(Ballot ballot){
		ballotbox.add(ballot);
		ballotbox.addBallot(ballot.getProjectdescription().toString(), ballot.score());
		
	}
	

}
