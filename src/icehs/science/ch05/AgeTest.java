package icehs.science.ch05;

public class AgeTest {

	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다. 입장하세요.");
		}
		else if (age >= 13) {
			System.out.println("청소년입니다. 입장 불가합니다. 청소년 관람과 영화를 보세요");
		}
		else {
			System.out.println("어린이 입니다. 입장 불가합니다. 어린이관람과영화를보세요.");
		}

	}

}
