package icehs.science.ch05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumMoney = 0;

		System.out.print("������ �� ������ ����Ǿ�����? : ");
		int meetingNo = scanner.nextInt();
		System.out.println("======================");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		 for (int i = 1; i <= meetingNo; i++) {
		System.out.print(i + "�� ��� : ");
		int money = scanner.nextInt();
		sumMoney += money;
		 }
		 System.out.println("�� ����� " + sumMoney + " �Դϴ�.");
		 System.out.println("======================");
		 System.out.print("������ �ο����� �Է��ϼ���. : ");
		 int memberNo = scanner.nextInt();
		 System.out.println("======================");
		 int dutchMoney = sumMoney / memberNo;
		 System.out.println("��ġ���� �ݾ���?");
		 for (int i = 1; i <= memberNo; i++) {
			 if(i != memberNo) {

				System.out.println(i + " : " + dutchMoney + "��");
				sumMoney -= dutchMoney;
			 } else {
			 System.out.println(memberNo + " : " + sumMoney + "��");
				 
			 }
		 }
	}

}