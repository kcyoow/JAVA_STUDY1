package icehs.science.ch10.cars;

public class Truck extends Car{
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ�� " + distance + "km �̵��մϴ�.");
		System.out.println("���� : " + super.getOilSize());
	}
}
