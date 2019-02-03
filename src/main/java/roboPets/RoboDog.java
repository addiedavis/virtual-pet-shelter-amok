package roboPets;

public class RoboDog extends Robo {

	public RoboDog(String name, int oilLevel, int happyLevel, int healthLevel) {
		this.name = name;
		this.oilLevel = oilLevel;
		this.happyLevel = happyLevel;
		this.healthLevel = healthLevel;
	}

	public void walkDog() {
		happyLevel += 5;
	}

}
