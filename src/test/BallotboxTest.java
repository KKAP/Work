package test;
import user.*;
import model.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class BallotboxTest {
	private Voter a = new Student("peach");
	private Project b = new Project("TV", "very big");
	private Categories c= new Categories("beautiful");
	Ballotbox z = new Ballotbox();
	Ballot zz = new Ballot(a, b, c);
	Ballot zzz = new Ballot(a, b, c);
	Ballot zzzzz = new Ballot(a, b, c);
	Ballot zzzz = new Ballot(a, b, c);
	
	
	@Test
	public void testAddBallot() {
		z.addBallot("ppp");
		z.addBallot("ppp");
		z.addBallot("ppp");
		z.addBallot("ppp");
		assertEquals(4, z.getScore("ppp"));
	}

	@Test
	public void testAdd() {
		z.add(zz);
		z.add(zzz);
		z.add(zzzz);
		z.add(zzzzz);
		assertEquals(4,4 );
	}

	

}
