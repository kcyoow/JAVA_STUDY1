package icehs.science.ch06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee mintChocoCoffee = new Coffee();
		Coffee americano = new Coffee();
		Coffee cafelatte = new Coffee();
		Coffee makiatto = new Coffee();
		mintChocoCoffee.name = "민트초코커피(싸고 맛있음)";
		mintChocoCoffee.price = 2500;
		mintChocoCoffee.printCoffeeInfo();
		americano.name = "아메리카노";
		americano.price = 6500;
		americano.printCoffeeInfo();
		cafelatte.name = "카페라떼";
		cafelatte.price = 5000;
		cafelatte.printCoffeeInfo();
		makiatto.name = "마끼아또";
		makiatto.price = 5500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = mintChocoCoffee.price + cafelatte.price + makiatto.price + americano.price;
		System.out.println("총 금액 : " + totalPrice + "원");
	}

}
