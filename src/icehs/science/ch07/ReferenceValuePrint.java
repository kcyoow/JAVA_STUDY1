package icehs.science.ch07;

public class ReferenceValuePrint {

	public static void main(String[] args) {
		Publication publication1 = new Publication();
		Publication publication2 = new Publication();
		
		System.out.println("publication1 �� ��ü ���� �ּҰ�");
		System.out.println(publication1);
		
		System.out.println("publication1 �� ��ü ���� �ּҰ�");
		System.out.println(publication2);
		
		int i = 10;
		System.out.println("int ���� ���� �� : " + i);
	}

}
