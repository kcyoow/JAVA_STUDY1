package icehs.science.ch10;

public class SubClass extends SuperClass implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodSecond() {
		System.out.println("두번째 메서드 반드시 구현");
		
	}

	@Override
	public void methodFirst() {
		System.out.println("첫번째 메서드 반드시 구현");

	}

}
