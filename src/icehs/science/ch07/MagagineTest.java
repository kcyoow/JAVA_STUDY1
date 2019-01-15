package icehs.science.ch07;

public class MagagineTest {

	public static void main(String[] args) {
		Magazine mag = new Magazine();
		// mag.price = 2000; //오류발생
		mag.setPrice(2000);
		int discountPrice = mag.discountPrice(10);
		System.out.println("I Was A Car");
	}

}
