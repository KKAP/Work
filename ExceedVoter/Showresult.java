package ExceedVoter;
import java.util.Iterator;
import java.util.Set;


public class Showresult {

	public void show(Ballotbox ballotBox) {
		GUIshowresult guiShow = new GUIshowresult();
		Set<String> set = ballotBox.getBallotBox().keySet();
		Iterator iter = (Iterator)set.iterator();
		while (iter.hasNext()) {
			String key = (String)iter.next();
//			System.out.print(key+ " ");
//			System.out.println(ballotBox.getBallotBox().get(key));
			int a=(Integer) ballotBox.getBallotBox().get(key);
			guiShow.guiResult(key+"",a+"");
			guiShow.setShow(true);
			
		}

	}


}
