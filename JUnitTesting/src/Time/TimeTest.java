package Time;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTotalSeconds() {
		int result = Time.getTotalSeconds("01:00:00");
		//assertEquals(result, 3600);
		assertTrue("The value returned was not as expected", result ==3600);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testGetTotalSecondsInvalidFormat()
	{
		int result = Time.getTotalSeconds("1:00");
	}
	
	@Test
	public void testGetTotalSecondsBoundary()
	{
		int result = Time.getTotalSeconds("00:00:00");
		assertTrue("The value for the lower boundary was not zero", result==0);
	}

	@Test
	public void testGetSeconds() 
	{
		int result = Time.getSeconds("00:00:02");
		assertTrue("The value of seconds is incorrect", result==2);
	}

	@Test
	public void testGetTotalMinutes() {
		int result = Time.getTotalMinutes("00:05:00");
		assertTrue("The value of seconds is incorrect", result==5);
	}

	@Test
	public void testGetTotalHours() {
		int result = Time.getTotalHours("08:00:00");
		assertTrue("The value of seconds is incorrect", result==8);
	}

}

