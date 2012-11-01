package user;
/*
 * This is the comittee class. It will be filled in the next iteration
 */

public class Commitee implements Voter {
	private int remaining=2;
	private String name;
	public Commitee(String name) {
		this.name=name;
	}
	public int getRemainning(){ return remaining;}
	public void subtraceRemainning(){ remaining--;}
}
