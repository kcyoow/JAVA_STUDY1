package icehs.science.ch09;

public class Person {
	private String name;
	private String phoneNumber;
	
	public Person() {
		
	}
	
	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public void eat() {
		System.out.println("���� �Ծ��.");
	}
	public void sleep() {
		System.out.println("���� �ڿ�.");
	}

}
