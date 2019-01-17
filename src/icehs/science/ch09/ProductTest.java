package icehs.science.ch09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("�뵹��", 450000, 8);
		Television tv = new Television("�ó׸�TV", 3500000, 10, "ȭ�� ũ�Ⱑ 151cm");
		
		laundry.printProductInfo();
		System.out.println("------------------------------------------------------");
		tv.printProductInfo();
		System.out.println("��� : " + tv.getDescription());
		
		System.out.println("\n[����] �������� ��� 15%�� �����Ͽ����ϴ�.\n");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("�뵹�� �ǸŰ� : " + laundry.calculateDiscountPrice());
		System.out.println("�ó׸�TV �ǸŰ� : " + tv.calculateDiscountPrice());

	}

}
