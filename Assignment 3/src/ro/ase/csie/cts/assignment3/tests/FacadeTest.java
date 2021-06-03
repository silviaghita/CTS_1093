package ro.ase.csie.cts.assignment3.tests;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.csie.cts.assignment3.facade.GameServer;
import ro.ase.csie.cts.assignment3.facade.LogIn;
import ro.ase.csie.cts.assignment3.singleton.ServerSingleton;
import ro.ase.csie.cts.g1093.dp.facade.UserAPIFacade;
import ro.ase.csie.cts.g1093.dp.facade.UserProfile;

class FacadeTest {

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
	public void testFacade() {
		GameServer server = new GameServer();
		server.connect();
		LogIn login = new LogIn("player1", "ip123");
		login.login();
		
		
//		UserProfile userProfile = login.getUserProfile();		
//		String profile1 = userProfile.getProfie();
//		
//		String profile2 = UserAPIFacade.getUserProfile("player2", "123456");
//		
//		assertEquals("Testing Facade", profile1, profile2);
		}
	
}
