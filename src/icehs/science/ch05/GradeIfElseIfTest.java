package icehs.science.ch05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gildong = 92;
		if (gildong >= 90 && gildong <= 100) {
			System.out.println("100�� ���� ~ 90�� �̻� : A���� �Դϴ�.");
		}
		else if (gildong >= 80 && gildong < 90) {
			System.out.println("90�� �̸� ~ 80�� �̻� : B���� �Դϴ�.");
		}
		else if (gildong >= 70 && gildong < 80) {
			System.out.println("80�� �̸� ~ 70�� �̻� : C���� �Դϴ�.");
		}
		else if (gildong >= 60 && gildong < 70) {
			System.out.println("70�� �̸� ~ 60�� �̻� : D���� �Դϴ�.");
		}
		else {
			System.out.println("60�� �̸� : F���� �Դϴ�.");
		}

	}

}
