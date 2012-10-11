/*This class will identify the user that if they're student or not.
 */

public class Student implements Voter {
	private int remaining=2;
	private String name;

	public Student(String name) {
		this.name = name;
	}
	
	public int getRemainning(){ return remaining;}
	public void subtraceRemainning(){ remaining--;}
	
	public String getName() {
		return name;
	}

}
