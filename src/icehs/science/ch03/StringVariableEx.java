package icehs.science.ch03;

public class StringVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ȫ�浿";
		String mathScore = "96";
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("�̸� : " + name);
		System.out.println("�������� : " + mathScore);
		System.out.println("�������� : " + englishScore);
		System.out.println("--------------------");
		System.out.println(mathScore + englishScore);
		System.out.println(parseMathScore + englishScore);

	}

}