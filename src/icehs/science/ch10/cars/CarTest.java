package icehs.science.ch10.cars;

public class CarTest {

	public static void main(String[] args) {
		Car [] cars = {
			new Taxi(),
			new Truck()
		};
		
		/*
		 * for(int i = 0; i < cars.length; i++) { cars[i].setOilSize(10); }
		 * cars[0].go(20); cars[1].go(30);
		 */
		cars[0].wash();
		System.out.print("(�����ĤĤĤĤĤ�)");
		System.out.print("�ý� : ");
		cars[0].wash();
		System.out.print("(�����ĤĤĤĤĤ�)");
		System.out.print("Ʈ�� : ");
		cars[1].wash();
	}

}
