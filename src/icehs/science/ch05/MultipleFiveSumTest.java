package icehs.science.ch05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int index = 1;
		int count = 1;
		while (sum <= 100) {
			int number = index * 5;
			sum += number;
			System.out.println(count++ + ". " + "( + " + number + " )" + " " + sum );
		}

	}

}
