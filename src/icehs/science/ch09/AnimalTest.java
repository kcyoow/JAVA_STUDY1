package icehs.science.ch09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(1, "��", "���θ�");
		Dog dog = new Dog(2, "�ú����� �㽺Ű", "Husky");

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
