package roboPets;

public class RoboDog extends Robo {

	public RoboDog(String name, int oilLevel, int happyLevel, int healthLevel, int messLevel) {
		this.name = name;
		this.oilLevel = oilLevel;
		this.happyLevel = happyLevel;
		this.healthLevel = healthLevel;
		this.messLevel = messLevel;
	}

	public void walkDog() {
		happyLevel += 5;
	}

}
