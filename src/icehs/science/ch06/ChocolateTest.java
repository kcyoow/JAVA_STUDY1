package icehs.science.ch06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "��Ʈ����";
		choco.type = "��Ʈ�� ����";
		choco.price = 2000;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println(chocoName + " ���ݷ� 20�� : " + totalPrice);
		
		choco.changeChocolateInfo("���޽ÿ� ��Ʈ����", 2500);
		
		int resultPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(choco.getName() + "���ݷ� 15��(10%����) : " + resultPrice);
		
		choco.changeChocolateInfo("������ ���޽ÿ��� ��Ʈ����", "���� ��Ʈ�� ����", 2500);
	}

}
