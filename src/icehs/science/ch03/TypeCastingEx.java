package icehs.science.ch03;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long billWealth = 7000000000L;
		System.out.println("Original Value : " + billWealth);
		double doubleBillWealth = billWealth;
		System.out.println("double형으로 변환 :" + doubleBillWealth );
		int intBillWealth = (int) billWealth;
		System.out.println("int형으로 변환 : " + intBillWealth);
	}

}
