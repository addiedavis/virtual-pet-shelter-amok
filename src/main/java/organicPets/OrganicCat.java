package organicPets;

public class OrganicCat extends Organic {

	public OrganicCat(String name, int hungerLevel, int thirstLevel, int happyLevel, int healthLevel, int messLevel) {
		this.name = name;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.happyLevel = happyLevel;
		this.healthLevel = healthLevel;
		this.messLevel = messLevel;
	}

	@Override
	public void walkDog() {	
	}

	public void clean() {
		messLevel = 0;		
	}
}
