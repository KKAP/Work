import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class keeps all the ballot of the votes
 */

public class BallotBox {

	private Map<String, Integer> map = new HashMap<String, Integer>();
/**
 * 
 * @param nameProject get is to use to check a Score in Map.
 * @return a Score from a Map.
 */
	public int getScore(String nameProject) {
		return map.get(nameProject);
	}
/**
 * 
 * @param a get this to use to be a key to add a ballot.
 * this method is add Ballot method.
 */
	public void addBallot(String a) {

		if (map.containsKey(a)) {
			map.put(a, map.get(a) + 1);
		} else
			map.put(a, 1);
	}
/**
 *  
 * @return a Map of a all the voted.
 */
	public Map getBallotBox() {
		return map;
	}

}
