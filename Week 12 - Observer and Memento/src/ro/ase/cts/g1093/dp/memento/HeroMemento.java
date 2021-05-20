package ro.ase.cts.g1093.dp.memento;

import java.util.Date;

public class HeroMemento {

	String name;
	int lifePoints;
	String magic;
	
	Date timeStamp;

	public HeroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timeStamp = new Date();
	}
	
	

}
