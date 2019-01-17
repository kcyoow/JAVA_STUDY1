package icehs.science.ch09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(1, "모름", "포로리");
		Dog dog = new Dog(2, "시베리안 허스키", "Husky");

		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		dog.printDogInfo();
		dog.run();
		dog.hunt();

	}

}
