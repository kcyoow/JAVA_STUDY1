package icehs.science.ch09;

public class Animal {
	private int age;
	private String kind;
	
	
	
	public Animal(int age, String kind) {
		this.age = age;
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void run() {
		System.out.println("�޷���!!");
	}
	public void hunt() {
		
	}
	public void play() {
		
	}
	public void printAnimialInfo() {
		System.out.println("���� : " + this.age + "��");
		System.out.println("���� : " + this.kind);
	}
}
