package icehs.science.ch08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("아마도라", "다크", 2200);
		chocos[1] = new Chocolate("민트초코", "민트", 2000);
		chocos[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		chocos[0].printChocolateInfo();
		chocos[1].printChocolateInfo();
		chocos[2].printChocolateInfo();
		System.out.println("냠냠");
	}

}
