package icehs.science.ch06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee mintChocoCoffee = new Coffee();
		Coffee americano = new Coffee();
		Coffee cafelatte = new Coffee();
		Coffee makiatto = new Coffee();
		mintChocoCoffee.name = "��Ʈ����Ŀ��(�ΰ� ������)";
		mintChocoCoffee.price = 2500;
		mintChocoCoffee.printCoffeeInfo();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 6500;
		americano.printCoffeeInfo();
		cafelatte.name = "ī���";
		cafelatte.price = 5000;
		cafelatte.printCoffeeInfo();
		makiatto.name = "�����ƶ�";
		makiatto.price = 5500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = mintChocoCoffee.price + cafelatte.price + makiatto.price + americano.price;
		System.out.println("�� �ݾ� : " + totalPrice + "��");
	}

}
