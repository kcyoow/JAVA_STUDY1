package icehs.science.ch08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("�Ƹ�����", "��ũ", 2200);
		chocos[1] = new Chocolate("��Ʈ����", "��Ʈ", 2000);
		chocos[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		chocos[0].printChocolateInfo();
		chocos[1].printChocolateInfo();
		chocos[2].printChocolateInfo();
		System.out.println("�ȳ�");
	}

}
