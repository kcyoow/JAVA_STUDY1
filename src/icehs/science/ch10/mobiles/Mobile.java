package icehs.science.ch10.mobiles;

public class Mobile {
	private String production;
	private int price;
	
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public void call (int time) {
		System.out.println(this.production + " : " + time + "�� ��ȭ�߽��ϴ�.");
	}
	public void charge (int time) {
		System.out.println(this.production + " : " + time + "�����߽��ϴ�.");
		
	
	}
}
