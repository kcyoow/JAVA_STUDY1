package icehs.science.ch03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lottoPercentage = 0.0000001235;
		int lotto2 = (int)lottoPercentage;
		long populationsAllAroundTheWorld = 6973738433L;
		int populations2 = (int) populationsAllAroundTheWorld;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoPercentage);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ : " + lotto2);
		System.out.println("�� ������ �α��� : " + populationsAllAroundTheWorld);
		System.out.println("�� ������ �α��� int ��ȯ : " + populations2);
	}

}
