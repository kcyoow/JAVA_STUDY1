package icehs.science.ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		
		hong.studentName = "홍길동";
		hong.studentId = "S001";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 89;
		
		hong.printStudentInfo();
		System.out.println();
		System.out.println("* 학번을 번경합니다!!");
		System.out.println();
		hong.changeStudentId("STU0001");
		
		hong.printStudentInfo();
		int avg = hong.calculateAverage();
		System.out.println("평균 성적 : " + avg);

	}

}
