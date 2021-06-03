package ro.ase.csie.cts.assignment3.facade;

public class UserAPIFacade {
	
		public static String getUserProfile(String user, String pass) {
			
			GameServer server = new GameServer();
			server.connect();
			
			LogIn login = new LogIn("player1", "password111");
			login.login();

			UserProfile userProfile = login.getUserProfile();		
			String profile = userProfile.getProfie();
			
			return profile;
		}

}
