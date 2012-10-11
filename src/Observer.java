/*
 * This is the observer class. It will be filled in the next iteration
 */

public class Observer implements Voter {
	private int remaining=1;
	public int getRemainning(){ return remaining;}
	public void subtraceRemainning(){ remaining--;}

}
