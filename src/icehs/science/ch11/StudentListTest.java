package icehs.science.ch11;

import java.util.ArrayList;

public class StudentListTest {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("�̼���", 80, 90, 95));
		students.add(new Student("������", 95, 89, 92));
		students.add(new Student("������", 88, 97, 94));
		for(Student student : students) {
			System.out.println(student.getName() + "( ���� : " + student.getKorean() + ", ���� : " + student.getEnglish() + ", ���� : " + student.getMath() + ")");
		}
		
	}
	
}
