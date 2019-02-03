package organicPets;

import shelter.Pet;

public class Organic extends Pet {

	protected int hungerLevel;
	protected int thirstLevel;
	public Organic() {
		super();
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

}