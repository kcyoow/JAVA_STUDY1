package icehs.science.ch06;

public class Account {
	String accountName;
	String accountNo;
	int balance;
	
	void deposit (int money) {
		System.out.println(money + " �� �Ա��մϴ�.");
		if (money < 0) {
			System.out.println("[����]�ݾ��� ���� ������ �Է� �����մϴ�.");
		} else {
		balance += money;
		printBalance();
		}
	}
	int withdraw (int money) {
		System.out.println(money + " �� ����մϴ�.");
		if (money < 0) {
			System.out.println("[����]�ݾ��� ���� ������ �Է� �����մϴ�.");
		} else if (money > balance) {
			System.out.println("[����]�ܾ��� �����մϴ�. �Ф�");
			return 0;
		} else {
		balance -= money;
		printBalance();
		return money;
		}
	}
	
	void printAccountInfo () {
		System.out.println("���� : " + accountNo + "( ������ : " + accountName + " )");
		printBalance();
	}
	void printBalance() {
		System.out.println("�ܾ� : " + balance + "��");
	}
	




}
