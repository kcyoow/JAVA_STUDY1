package icehs.science.ch09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("통돌이", 450000, 8);
		Television tv = new Television("시네마TV", 3500000, 10, "화면 크기가 151cm");
		
		laundry.printProductInfo();
		System.out.println("------------------------------------------------------");
		tv.printProductInfo();
		System.out.println("비고 : " + tv.getDescription());
		
		System.out.println("\n[공지] 할인율이 모두 15%로 변경하였습니다.\n");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("통돌이 판매가 : " + laundry.calculateDiscountPrice());
		System.out.println("시네마TV 판매가 : " + tv.calculateDiscountPrice());

	}

}
