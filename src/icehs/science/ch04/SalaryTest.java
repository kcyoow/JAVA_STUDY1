package icehs.science.ch04;

public class SalaryTest {

	public static void main(String[] args) {
		int Salary = 1000000;
		int aYearSalary = Salary * 12;
		int taxAYearSalary = aYearSalary - (int)(aYearSalary * 0.1);
		System.out.println("���� : " + aYearSalary + ", " + "���� ���� : " + taxAYearSalary);
		int bonus = Salary - (int)(Salary * 0.2);
		int taxBonus = bonus - (int)(bonus *0.055);
		System.out.println("���ʽ� : " + bonus + ", " + "���� ���ʽ� : " + taxBonus);
		System.out.println("���޾� : " + (taxAYearSalary + taxBonus));
	}

}
