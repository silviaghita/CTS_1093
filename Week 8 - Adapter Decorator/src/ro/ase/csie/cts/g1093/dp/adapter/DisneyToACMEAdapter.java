package ro.ase.csie.cts.g1093.dp.adapter;

public class DisneyToACMEAdapter extends ACMECharacter {
	
	DisneyActions disneyCharacter = null;
	
	public DisneyToACMEAdapter(DisneyActions disneyC) {
		super(disneyC.getName(), disneyC.getPowerLevel());
		this.disneyCharacter = disneyC;
	}

	@Override
	public void move() {
		this.disneyCharacter.changeLocation(0, 0);
	}

	@Override
	public void takeAHit(int points) {
		this.disneyCharacter.losePower(points);
	}

	@Override
	public void heal(int points) {
		this.disneyCharacter.recoverPower(points);
	}

}
