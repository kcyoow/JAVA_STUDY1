package icehs.science.ch05;

public class GuGuDanNew {

	public static void main(String[] args) {
		for (int dan = 2; dan<= 9; dan++) {
			if (dan == 5) { continue; }
			for (int i = 1; i<=9; i++ ) {
				
				  System.out.print(dan + " * " + i + " = " + dan * i + "\t");
				 				
				 			}
			System.out.println();
		}

	}

}
