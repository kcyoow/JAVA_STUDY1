package icehs.science.ch10.animals;

public class AnimalTest {

	public static void main(String[] args) {
		Bird bird = new Bird("������", 3, "�������");
		System.out.println(bird.getKind() + " (" + bird.getAge() + "��) : " + bird.getHabitat());
		bird.spreadWings();
		bird.fly();
	}

}
