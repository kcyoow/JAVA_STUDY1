package icehs.science.ch10.mobiles;

public class Galaxy extends Mobile {
	private String osVersion;
	
	
	
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	

	public void charge (int time) {
		System.out.println(super.getProduction() + " : �������͸� " + time + "�� ����");
	}
	
}
