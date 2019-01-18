package icehs.science.ch10.cars;



public class Car implements Washer {
	private int oilSize;
	
	public void go(int distance) {
		System.out.println(distance + " km 이동합니다.");
		System.out.println("연료 : " + this.oilSize);
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	@Override
	public void wash() {
		System.out.println("세차 합니당~~.");
	}
	
}
