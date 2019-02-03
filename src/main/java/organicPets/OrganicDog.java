package organicPets;
public class OrganicDog extends Organic {

	public OrganicDog(String name, int hungerLevel, int thirstLevel, int happyLevel, int healthLevel) {
		this.name = name;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.happyLevel = happyLevel;
		this.healthLevel = healthLevel;
	}

	public void walkDog() {
		happyLevel += 5;
		
	}


}
