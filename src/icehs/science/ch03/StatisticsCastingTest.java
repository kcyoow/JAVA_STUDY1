package icehs.science.ch03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lottoPercentage = 0.0000001235;
		int lotto2 = (int)lottoPercentage;
		long populationsAllAroundTheWorld = 6973738433L;
		int populations2 = (int) populationsAllAroundTheWorld;
		
		System.out.println("로또에 당첨될 확률 : " + lottoPercentage);
		System.out.println("로또에 당첨될 확률 int 변환 : " + lotto2);
		System.out.println("전 세계의 인구수 : " + populationsAllAroundTheWorld);
		System.out.println("전 세계의 인구수 int 변환 : " + populations2);
	}

}
