package icehs.science.ch05;

public class ConditionEx {

	public static void main(String[] args) {
		
		int age = 15;
		if ( age < 19 ) {
			System.out.println( "19세 미만만 입장가능" );
			System.out.println("입장불가");
		}
		if (age >= 19) {
			System.out.println("성인입니다");
			System.out.println("입장가능");
		}
		

	}

}
