package icehs.science.ch03;


public class StringToInt {
	
	public static void main(String[] args) {
		String firstNum = "25";
		String second = "20";
		int intFirstNum = Integer.parseInt(firstNum);
		int intSecondNum = Integer.parseInt(second);
		//����Ÿ��
		System.out.println(firstNum + second);
		//����Ÿ�� �Ľ�
		System.out.println(intFirstNum + intSecondNum);
		//����ȭ ��
		System.out.println(firstNum + second + intFirstNum + intSecondNum);
		//���� �� ���ϰ� ���ڿ��� �ٲ�
		System.out.println(intFirstNum + intSecondNum + firstNum + second);
		//���ڵ�
		System.out.println(firstNum + intFirstNum);
	}
}
