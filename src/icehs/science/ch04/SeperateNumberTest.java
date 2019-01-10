package icehs.science.ch04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		System.out.println("숫자 : " + number);
		int number100 = number / 100;
		System.out.println("백의 자리 수 : " + number100);
		number100 = number % 100; 
		int number10 = number100 / 10;
		System.out.println("십의 자리 수 : " + number10);
		number10 = number100 % 10; 
		int number1 = number10 / 1;
		System.out.println("일의 자리 수 : " + number1);
	}

}
