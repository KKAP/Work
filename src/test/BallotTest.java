package test;
import user.*;
import model.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class BallotTest {
	private Voter a = new Student("peach");
	private ProjectDescription b = new ProjectDescription("TV", "very big");
	
	@Test
	public void testBallot() {
		Ballot z = new Ballot(a, b);
		assertEquals("TV", b.toString());
		assertEquals("very big", b.getDescription());
	}

	

}
