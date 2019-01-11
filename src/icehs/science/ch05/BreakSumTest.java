package icehs.science.ch05;

public class BreakSumTest {
 
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for (;i <= 10; i++) {
			sum = sum + i;
			
			if (sum >= 30) {
				break;
			}
		}
		System.out.println(i + "¹ø¤Š");
		System.out.println("ÇÕ°è : " + sum);

	}

}
