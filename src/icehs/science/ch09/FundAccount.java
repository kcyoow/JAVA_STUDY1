package icehs.science.ch09;
//obje
public class FundAccount extends Account {
	private double earningRate;

	
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("���ͷ� : " + this.earningRate + "%");
		System.out.println("������ �߻��Ͽ����ϴ�.");
	}
	
	public String toString() {
		return "���ͷ� : " + this.earningRate + "%";
		
	}
}
