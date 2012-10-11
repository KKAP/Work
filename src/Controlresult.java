import java.util.Iterator;
import java.util.Set;

public class Controlresult {
	Ballotbox ballotbox;
	private int i=0;
	private Guiresult guiresult;

	Controlresult(Ballotbox ballotbox) {
		this.ballotbox = ballotbox;
		guiresult = new Guiresult();

	}

	public void show(Ballotbox ballotBox) {
		Set<String> set = ballotBox.getBallotBox().keySet();
		Iterator iter = (Iterator) set.iterator();
		while (iter.hasNext()) {
			i++;
			String key = (String) iter.next();
			int a = (Integer) ballotBox.getBallotBox().get(key);
			guiresult.show(i, key, a);
		}
		guiresult.setvisible(true);
	}
}
