package shelter;

public class Pet {

	protected String name;
	protected int happyLevel;
	protected int healthLevel;
	protected int messLevel;

	public Pet() {
	}

	public String getName() {
		return name;
	}

	public int getHappyLevel() {
		return happyLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getMessLevel() {
		return messLevel;
	}

	public void walkDog() {
		
		happyLevel += 5;	
	}

	public void clean() {
		messLevel -= 5;		
	}

}