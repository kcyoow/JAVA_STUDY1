package icehs.science.ch09;

public class Teacher extends Person{

	private String subject;
	
	

	public Teacher() {
	}

	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("���Ǹ� �ؿ�.");
	}
	@Override
	public void eat() {
	super.eat();
		System.out.println("ȥ���ؿ�.");
	}
	
}
