package icehs.science.ch09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	public Product(String name, int price, int discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printProductInfo() {
		System.out.println("========제품정보=========");
		System.out.println("제품명 : " + this.name);
		System.out.println("정가 : " + this.price + " (할인율 : " + this.discountRate + ")");
		System.out.println("판매가 : " + this.calculateDiscountPrice());
	}
	public int calculateDiscountPrice() {
		return (int)(this.price * (100 - this.discountRate) / 100);
		
	}
	
}
