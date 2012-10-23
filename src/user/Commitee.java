package user;
/*
 * This is the comittee class. It will be filled in the next iteration
 */

public class Commitee implements Voter {
	private int remaining=2;
	public int getRemainning(){ return remaining;}
	public void subtraceRemainning(){ remaining--;}
}
