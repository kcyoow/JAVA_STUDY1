package icehs.science.ch05;

public class GuGuDan {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				if (i == 9) {
					System.out.println(j + " * " + i + " = " + i*j);
				} else {
					System.out.println(j + " * " + i + " = " + i*j);
				}
				
				
				System.out.print(i + " * " + j + " = " + i * j);
				
			}
		}

	}

}
