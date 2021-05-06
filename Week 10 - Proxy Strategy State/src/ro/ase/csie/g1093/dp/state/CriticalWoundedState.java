package ro.ase.csie.g1093.dp.state;

public class CriticalWoundedState implements MoveStateInterface {

	@Override
	public void moveToDifferentLocation() {
		System.out.println("The hero can't move");
	}

}
