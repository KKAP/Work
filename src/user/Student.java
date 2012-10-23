package user;
/*This class will identify the user that if they're student or not.
 */

public class Student implements Voter {
	private int remaining=2;
	private String name;

	/**
	 * 
	 * @param name is the name of the student.
	 * this method is a constructor of student class.
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 * return remaining.
	 */

	public int getRemainning(){ return remaining;}
	/**
	 * remaining minus one.
	 */
	public void subtraceRemainning(){ remaining--;}

	
	/**
	 * 
	 * @return a name of the student.
	 */

	public String getName() {
		return name;
	}


}
