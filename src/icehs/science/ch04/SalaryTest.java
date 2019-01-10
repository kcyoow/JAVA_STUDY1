package icehs.science.ch04;

public class SalaryTest {

	public static void main(String[] args) {
		int aYearMoney = 12000000;
		long taxAYearMoney = aYearMoney - aYearMoney / 10;
		System.out.println("연봉 : " + aYearMoney + ", " + "세후 연봉 : " + taxAYearMoney);
		int bonus = 800000;
		double taxBonus = bonus - (bonus *0.055);
		System.out.println("보너스 : " + bonus + ", " + "세후 보너스 : " + (int)taxBonus);
		System.out.println("지급액 : " + (int)(taxAYearMoney + taxBonus));
	}

}
