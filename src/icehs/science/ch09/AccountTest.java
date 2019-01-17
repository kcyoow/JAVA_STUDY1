package icehs.science.ch09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fund = new FundAccount();
		fund.setNumber("111-2222");
		fund.setName("È«±æµ¿ÀÌ");
		fund.setBalance(500000);
		fund.setEarningRate(4.7);
		
		fund.openAccount();
		fund.earnMoney();

	}

}
