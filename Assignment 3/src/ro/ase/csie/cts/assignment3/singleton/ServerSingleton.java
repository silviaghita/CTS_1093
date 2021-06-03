package ro.ase.csie.cts.assignment3.singleton;

public class ServerSingleton implements ServerInterface {

	String url;
	String data;
	
	@Override
	public String getIpAddress() {
		return this.getIpAddress();
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
	
	private static ServerSingleton theServer = null;
	
	private ServerSingleton(String url, String data) {
		this.url = url;
		this.data = data;
	}
	
	private ServerSingleton() {
		
	}
	
	public static synchronized ServerSingleton getServer() {
		if(theServer == null) {
			String url = "www.acs.ase.ro/game";
			String data = "get backend connection";
			theServer = new ServerSingleton(url,data);
		}
		return theServer;
	}
}