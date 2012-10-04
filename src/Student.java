/*This class will identify the user that if they're student or not.
 */

public class Student implements Voter {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
