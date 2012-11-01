package user;
/*
 * This is the observer class. It will be filled in the next iteration
 */

public class Observer implements Voter {
	private int remaining=1;
	private String name;
	public Observer(String name) {
		this.name= name;
	}
	public int getRemainning(){ return remaining;}
	public void subtraceRemainning(){ remaining--;}

}
