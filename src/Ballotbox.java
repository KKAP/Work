import java.util.HashMap;
import java.util.Map;

/**
 * This class keeps all the ballot of the votes
 */

public class Ballotbox {
	private Map<String, Integer> map = new HashMap<String, Integer>();

    /*return score of project*/
	public int getScore(String nameProject) {
		return map.get(nameProject);
	}
    /*add bollot */
	public void addBallot(String a) {
		if (map.containsKey(a)) {
			map.put(a, map.get(a) + 1);
		} else
			map.put(a, 1);
	}
    /*return Ballotbox*/
	public Map getBallotBox() {
		return map;
	}

}
