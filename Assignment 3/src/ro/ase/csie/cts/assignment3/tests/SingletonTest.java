package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.csie.cts.assignment3.singleton.ServerSingleton;

class SingletonTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPointingToSameObjRef() {
		ServerSingleton server1 = ServerSingleton.getServer();
		ServerSingleton server2 = ServerSingleton.getServer();
		
		assertEquals("Testing Singleton", server1, server2);
	}

}
