package icehs.science.ch05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gildong = 92;
		if (gildong >= 90 && gildong <= 100) {
			System.out.println("100점 이하 ~ 90점 이상 : A학점 입니다.");
		}
		else if (gildong >= 80 && gildong < 90) {
			System.out.println("90점 미만 ~ 80점 이상 : B학점 입니다.");
		}
		else if (gildong >= 70 && gildong < 80) {
			System.out.println("80점 미만 ~ 70점 이상 : C학점 입니다.");
		}
		else if (gildong >= 60 && gildong < 70) {
			System.out.println("70점 미만 ~ 60점 이상 : D학점 입니다.");
		}
		else {
			System.out.println("60점 미만 : F학점 입니다.");
		}

	}

}
