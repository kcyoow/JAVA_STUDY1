package icehs.science.ch03;

public class EmployeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ȫ�浿";
		String enterYear = "1995";
		int workingYears = 2019;
		int intEnterYear = Integer.parseInt(enterYear);
		int employedYear = workingYears - intEnterYear;
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + enterYear);
		System.out.println("�ٹ���� : " + employedYear);
		String sys = "[system]";
		System.out.println(sys + "�ȳ� ������!");
	}

}
