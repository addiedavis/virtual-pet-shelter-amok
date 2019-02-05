package roboPets;

public class RoboCat extends Robo {

	public RoboCat(String name, int oilLevel, int happyLevel, int healthLevel, int messLevel) {
		this.name = name;
		this.oilLevel = oilLevel;
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
