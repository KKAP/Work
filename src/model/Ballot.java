package model;
import java.util.HashMap;
import java.util.Map;

/**
 * This class authenicate the user so that each kind of user would have
 * different votes And this class will calculate the votes that the user still
 * can vote
 * 
 */
import user.*;
public class Ballot {
	private Voter voter;
	private ProjectDescription projectdescription;
	private Criterion criterion;
	private Map<Criterion, Integer> map = new HashMap<Criterion, Integer>();
	/**
	 * 
	 * @param voter which voter.
	 * @param project project description.
	 * this is a constructor class.
	 */
	public Ballot(Voter voter, ProjectDescription project ){
		this.voter=voter;
		projectdescription = project;
	}



	public Criterion getCriterion(){
		return criterion;
	}

	public ProjectDescription getProjectdescription() {
		return projectdescription;
	}
	public Voter getVoter(){
		return voter;
	}
	public int score(){
		return map.get(criterion.BESTGRAPHICS)+map.get(criterion.BESTIDEA)+map.get(criterion.MOSTUSEFUL);
	}



	public void add(int bestGraphic, int bestIdea, int usable) {
		map.put(criterion.BESTGRAPHICS, bestGraphic);
		map.put(criterion.BESTIDEA, bestIdea);
		map.put(criterion.MOSTUSEFUL, usable);
		
	}
	

}
