package icehs.science.ch04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		System.out.println("���� : " + number);
		int number100 = number / 100;
		System.out.println("���� �ڸ� �� : " + number100);
		number100 = number % 100; 
		int number10 = number100 / 10;
		System.out.println("���� �ڸ� �� : " + number10);
		number10 = number100 % 10; 
		int number1 = number10 / 1;
		System.out.println("���� �ڸ� �� : " + number1);
	}

}
