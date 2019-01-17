package icehs.science.ch09;


public class Dog extends Animal {
	private String name;

	public Dog(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		System.out.println("�޷���!!!");
		System.out.println("�ü� 40km�� �پ�!!");
	}
	@Override
	public void hunt() {
		System.out.println("������ ��ƿ�~~");
		
	}
	public void printDogInfo() {
		System.out.println("�̸� : " + this.name);
		super.printAnimialInfo();
	}
}
