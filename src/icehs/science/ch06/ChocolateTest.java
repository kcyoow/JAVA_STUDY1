package icehs.science.ch06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "민트초코";
		choco.type = "민트와 초코";
		choco.price = 2000;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println(chocoName + " 초콜렛 20개 : " + totalPrice);
		
		choco.changeChocolateInfo("달콤시원 민트초코", 2500);
		
		int resultPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(choco.getName() + "초콜렛 15개(10%할인) : " + resultPrice);
		
		choco.changeChocolateInfo("언제나 달콤시원한 민트초코", "많은 민트와 초코", 2500);
	}

}
