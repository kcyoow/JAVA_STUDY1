package icehs.science.ch04;

public class SalaryTest {

	public static void main(String[] args) {
		int aYearMoney = 12000000;
		long taxAYearMoney = aYearMoney - aYearMoney / 10;
		System.out.println("���� : " + aYearMoney + ", " + "���� ���� : " + taxAYearMoney);
		int bonus = 800000;
		double taxBonus = bonus - (bonus *0.055);
		System.out.println("���ʽ� : " + bonus + ", " + "���� ���ʽ� : " + (int)taxBonus);
		System.out.println("���޾� : " + (int)(taxAYearMoney + taxBonus));
	}

}
