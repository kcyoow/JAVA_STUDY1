package icehs.science.ch05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		//for(int inx = 1; inx <= 10; inx++) {
		int inx = 1;

		while (inx <= 10) {
			int jnx = 1;
			//for(int jnx = 1; jnx <= 10; jnx++) {
			while (jnx <= inx) {
				System.out.print("*");
				jnx++;
			}
			System.out.println();
			inx++;
		}

	}

}
