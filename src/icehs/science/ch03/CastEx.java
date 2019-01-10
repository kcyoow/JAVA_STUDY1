package icehs.science.ch03;

public class CastEx {
	public static void main(String[] args) {
		double large = 100000000000000.574912498923492349823;
		long middle = (long)large;
		int small = (int)middle;
		
		System.out.println(large);
		System.out.println(middle);
		System.out.println(small);
	}
}
