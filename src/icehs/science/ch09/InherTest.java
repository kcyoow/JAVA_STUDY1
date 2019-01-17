package icehs.science.ch09;

public class InherTest {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("=====Student=====");
		student.eat();
		student.study();
		//student.teach() 는 쓸수가 없음
		System.out.println("=====Teacher=====");
		teacher.eat();
		teacher.teach();
		//teacher.study() 는 쓸수가 없음

	}

}

