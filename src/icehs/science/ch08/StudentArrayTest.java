package icehs.science.ch08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] students = {
				new Student("강감찬", "STU001", "010-1234-5678"),
				new Student("이순신", "STU002", "010-1234-4321"),
				new Student("김유신", "STU001", "010-1234-9876")
		};
		
		for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
			
		}
		/*for(Student student : students) { //향상된 for 구문
			student.printStudentInfo(); }
		*/
	}

}
