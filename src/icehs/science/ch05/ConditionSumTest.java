package icehs.science.ch05;

public class ConditionSumTest {

	public static void main(String[] args) {
		int index = 0;
		for(int i = 0; i <= 30; i++) {
			if (i % 2 != 0 && i % 3 != 0 ) {
			 index = i + index;
			}
		}
		System.out.println(index);
	}
}
