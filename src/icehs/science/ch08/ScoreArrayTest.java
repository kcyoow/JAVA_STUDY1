package icehs.science.ch08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = {78, 72, 68, 85, 89, 89};
		String[] subjects = {"국어", "영어", "수학", "과학", "물리", "정보"};
		int sum = 0;
		
		double average = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		
		average = (double)sum / scores.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		

	

	}

}
