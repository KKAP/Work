package test;
import user.*;
import model.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class BallotTest {
	private Voter a = new Student("peach");
	private ProjectDescription b = new ProjectDescription("TV", "very big");
	private Categories c= new Categories("beautiful");
	
	@Test
	public void testBallot() {
		Ballot z = new Ballot(a, b, c);
		assertEquals("TV", b.toString());
		assertEquals("very big", b.getDescription());
		assertEquals("beautiful", c.getCategories());
	}

	

}
