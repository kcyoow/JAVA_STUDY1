package icehs.science.ch04;

public class SalaryTest {

	public static void main(String[] args) {
		int Salary = 1000000;
		int aYearSalary = Salary * 12;
		int taxAYearSalary = aYearSalary - (int)(aYearSalary * 0.1);
		System.out.println("연봉 : " + aYearSalary + ", " + "세후 연봉 : " + taxAYearSalary);
		int bonus = Salary - (int)(Salary * 0.2);
		int taxBonus = bonus - (int)(bonus *0.055);
		System.out.println("보너스 : " + bonus + ", " + "세후 보너스 : " + taxBonus);
		System.out.println("지급액 : " + (taxAYearSalary + taxBonus));
	}

}
