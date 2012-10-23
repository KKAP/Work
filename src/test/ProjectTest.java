package test;
import model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectTest {

	Project project = new Project("peach", "test"); 
	@Test
	public void testProject() {
		assertEquals("peach", project.toString());
		assertEquals("test", project.getDescription());
	}

	@Test
	public void testSetDescription() {
		project.setDescription("aaa");
		assertEquals("aaa", project.getDescription());
		project.setDescription("zzz");
		assertEquals("zzz", project.getDescription());
	}

	@Test
	public void testSetName() {
		project.setName("irir");
		assertEquals("irir", project.toString());
		project.setName("peach");
		assertEquals("peach", project.toString());
	}

	

}
