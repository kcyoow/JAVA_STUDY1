package icehs.science.ch03;

public class EmployeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String enterYear = "1995";
		int workingYears = 2019;
		int intEnterYear = Integer.parseInt(enterYear);
		int employedYear = workingYears - intEnterYear;
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + enterYear);
		System.out.println("근무년수 : " + employedYear);
		String sys = "[system]";
		System.out.println(sys + "안녕 여러분!");
	}

}
