package icehs.science.ch10.animals;

public class Bird extends Animal implements Flyable {
	private String habitat;

	public Bird(String kind, int age, String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}

	@Override
	public void fly() {
		System.out.println("날아간다.(주작)");
	}

	@Override
	public void spreadWings() {
		System.out.println("날아오르라 주작이여");
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
