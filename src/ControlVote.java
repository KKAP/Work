public class ControlVote {

	private Ballotbox ballotbox;
	private Ballot ballot;

	public ControlVote(Ballotbox ballotbox, Ballot ballot) {
		this.ballot = ballot;
		this.ballotbox = ballotbox;
		ballotbox.add(ballot);

	}

}
