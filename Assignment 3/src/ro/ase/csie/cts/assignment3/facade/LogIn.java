package ro.ase.csie.cts.assignment3.facade;

public class LogIn implements ServerInterface {
	
	String ipAddress;
	String password;
	

	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		return this.getPort();
	}

	@Override
	public int getMaxConnections() {
		return this.getMaxConnections();
	}

	@Override
	public boolean connect() {
		System.out.println("Connected to server");
		return this.connect();
	}

	@Override
	public boolean disconnect() {
		System.out.println("Disconnected from server");
		return this.disconnect();
	}

		public LogIn(String ipAddress, String password) {
			super();
			this.ipAddress = ipAddress;
			this.password = password;
		}
		
		public void login() {
		
		}
		
		public UserProfile getUserProfile() {
			return new UserProfile();
		}
		
	
}
