package icehs.science.ch08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] students = {
				new Student("������", "STU001", "010-1234-5678"),
				new Student("�̼���", "STU002", "010-1234-4321"),
				new Student("������", "STU001", "010-1234-9876")
		};
		
		for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
			
		}
		/*for(Student student : students) { //���� for ����
			student.printStudentInfo(); }
		*/
	}

}
