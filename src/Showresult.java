
import java.util.Iterator;
import java.util.Set;
/*
 * This class get all the votes and calculate the result
 */

public class Showresult {

	public void show(Ballotbox ballotBox) {
		GUIshowresult guiShow = new GUIshowresult();
		Set<String> set = ballotBox.getBallotBox().keySet();
		Iterator iter = (Iterator)set.iterator();
		while (iter.hasNext()) {
			String key = (String)iter.next();
			int a=(Integer) ballotBox.getBallotBox().get(key);
			guiShow.guiResult(key+"",a+"");
			guiShow.setShow(true);
			
		}

	}


}
