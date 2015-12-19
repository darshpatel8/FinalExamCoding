package base;

import base.RateDAL;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class rateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRate() {
		double testrate1 = RateDAL.getRate(600);
		assertTrue(testrate1 == 5);
		
	}

}
