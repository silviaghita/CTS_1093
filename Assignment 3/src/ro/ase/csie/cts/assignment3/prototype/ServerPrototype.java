package ro.ase.csie.cts.assignment3.prototype;

import java.util.ArrayList;
import java.util.Random;

public class ServerPrototype implements ServerInterface, Cloneable {

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
	
	CarType type;
	String ipAddress;
	
	ArrayList<Integer> graphicPoints = new ArrayList<>();

	public ServerPrototype(CarType type, String ipAddress) {
		this.type = type;
		this.ipAddress = ipAddress;
		
		System.out.println("Generating the model points.....");
		
		try {
			Thread.sleep(1000);
			Random random = new Random(7887);
			for(int i = 0; i<20;i++) {
				graphicPoints.add(random.nextInt(500));
			}
			
			System.out.println("Model loaded.");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ServerPrototype() {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ServerPrototype copy = new ServerPrototype();
		copy.type = this.type;
		copy.ipAddress = this.ipAddress;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		
		return copy;
	}
	
}
