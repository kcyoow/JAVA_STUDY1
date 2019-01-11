package icehs.science.ch05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		//선 실행 후 조건 비교 반복 제어문
		do {
			System.out.print("정수를 입력하세요. : ");
			score = scanner.nextInt();
		}while (score < 0 || score > 100);
		System.out.println(score);

	}

}
