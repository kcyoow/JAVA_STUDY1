package icehs.science.ch05;

public class GuGuDanOddNumber {

	public static void main(String[] args) {
		int dan = 2;
		while (dan < 99) {
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			dan++;
		}
		/* for(int dan = 2; dan <= 5; dan++) {
		 * 		for(int i = 1' i<=9; i++){
		 * 		System.out.println(dan + " * " + i + " = " + dan*i);
		 * }
		 * }
		 * 
		 */

	}

}
