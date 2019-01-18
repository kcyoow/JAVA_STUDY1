package icehs.science.ch10.mobiles;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;
	
	
	
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	

	public void charge (int time) {
		System.out.println(super.getProduction() + " : 보조베터리 " + time + "분 충전");
	}
	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + " 앱을 " + price + "원에 구ㅇㅣㅂ해ㅆ스ㅂ니다.");
		
	}
	
}
