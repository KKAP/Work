import java.util.Iterator;
import java.util.Set;

public class Controlresult {
	private BallotBox ballotbox;
	private int i=0;
	private Guiresult guiresult;

	/**
	 * This is a constructor for a Controlresult class.
	 * @param ballotbox
	 */
	Controlresult(BallotBox ballotbox) {
		this.ballotbox = ballotbox;
		guiresult = new Guiresult();

	}
	/**
	 * This method is for show a vote count.
	 */
	public void show() {
		Set<String> set = ballotbox.getBallotBox().keySet();
		Iterator iter = (Iterator) set.iterator();
		while (iter.hasNext()) {
			i++;
			String key = (String) iter.next();
			int a = (Integer) ballotbox.getBallotBox().get(key);
			guiresult.show(i, key, a);
		}
		guiresult.setvisible(true);
	}
}
