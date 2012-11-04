package test;
import user.*;
import model.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class BallotboxTest {
	private Voter a = new Student("peach");
	private ProjectDescription b = new ProjectDescription("TV", "very big");
	//private Categories c= new Categories("beautiful");
	Ballotbox z = new Ballotbox();
	Ballot zz = new Ballot(a, b);
	Ballot zzz = new Ballot(a, b);
	Ballot zzzzz = new Ballot(a, b);
	Ballot zzzz = new Ballot(a, b);
	
	
	@Test
	public void testAddBallot() {
		z.addBallot("ppp",1);
		z.addBallot("ppp",1);
		z.addBallot("ppp",1);
		z.addBallot("ppp",1);
		z.addBallot("aa",1);
		z.addBallot("bb",1);
		z.addBallot("bb",1);
		z.addBallot("bb",1);
		assertEquals(4, z.getScore("ppp"));
		assertEquals(1, z.getScore("aa"));
		assertEquals(3, z.getScore("bb"));
	}

	@Test
	public void testAdd() {
		z.add(zz);
		z.add(zzz);
		z.add(zzzz);
		z.add(zzzzz);
		assertEquals(4,z.getBallot().size() );
		z.add(zz);
		z.add(zzz);
		z.add(zzzz);
		z.add(zzzzz);
		assertEquals(8,z.getBallot().size() );
	}

	

}
