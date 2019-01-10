package icehs.science.ch04;

public class InDeOperatorTest {

	public static void main(String[] args) {
		int i;
		for (i = 0;i<10;++i);
		System.out.println(i);
		
		int number1 = 10;
		int number2 = 3;
		System.out.println(++number1);
		System.out.println(number2++);
		
		int result = --number1 + number2--;
		System.out.println(result);
		
		int number = 20;
		System.out.println(++number);
		System.out.println(number--);
		System.out.println(--number);
		System.out.println(number--);
		
	}

}
