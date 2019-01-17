package icehs.science.ch09;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	
	
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");

		
	}
	public String toString() {
		String str = "���� ��ȣ : " + this.number + "\n";
		str += "������ : " + this.name + "\n";
		str += "�ܾ� : " + this.balance + "��";
		return str;
	}
}
