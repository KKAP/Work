package controler;

import model.Ballotbox;
import model.Project;
import GUI.GUIvote;

public class ControlProject {
	private Ballotbox ballotBox = new Ballotbox();
	private ControlVote controlVote = new ControlVote(ballotBox);
	public void show(Project project,int b){
		GUIvote guiVote = new GUIvote(project, b,controlVote);
	}
}
