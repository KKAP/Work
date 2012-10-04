package ExceedVoter;
import java.util.HashMap;
import java.util.Map;

public class Ballotbox  {	
	private Map< String, Integer> map = new HashMap<String, Integer>(); 

	public int getScore(String nameProject) {
		return map.get(nameProject);
	}
	
	public void addBallot(String a){
		if(map.containsKey(a)){
			map.put(a, map.get(a)+1);
		}
		else
			map.put(a, 1);
	}
	public Map getBallotBox(){
		return map;
	}


}


