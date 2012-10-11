import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class keeps all the ballot of the votes
 */

public class BallotBox {
	
	private List<Ballot> list;
	private Map<String, Integer> map = new HashMap<String, Integer>();

	
	public BallotBox() {
		list = new ArrayList<Ballot>();
	}
	
	public int getScore(String nameProject) {
		return map.get(nameProject);
	}

	public void add(String a) {
		if (map.containsKey(a)) {
			map.put(a, map.get(a) + 1);
		} else
			map.put(a, 1);
	}

	public Map getBallotBox() {
		return map;
	}

}
