package icehs.science.ch10.heroes;

public abstract class Hero implements CanFly, CanFight, CanSwim{

	@Override
	public void swim() {
		System.out.println("�� �ο��.");
		
	}

	@Override
	public void fight() {
		System.out.println("�� ���ģ��.");
	}		

	@Override
	public void fly() {
		 System.out.println("�� ����.");
		
	}
	public void action() {
		
	}

}
