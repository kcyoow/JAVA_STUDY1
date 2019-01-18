package icehs.science.ch10.heroes;

public abstract class Hero implements CanFly, CanFight, CanSwim{

	@Override
	public void swim() {
		System.out.println("이 싸운다.");
		
	}

	@Override
	public void fight() {
		System.out.println("이 헤엄친다.");
	}		

	@Override
	public void fly() {
		 System.out.println("이 난다.");
		
	}
	public void action() {
		
	}

}
