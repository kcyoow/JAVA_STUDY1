package icehs.science.ch03;


public class StringToInt {
	
	public static void main(String[] args) {
		String firstNum = "25";
		String second = "20";
		int intFirstNum = Integer.parseInt(firstNum);
		int intSecondNum = Integer.parseInt(second);
		//문자타입
		System.out.println(firstNum + second);
		//숫자타입 파싱
		System.out.println(intFirstNum + intSecondNum);
		//문자화 됨
		System.out.println(firstNum + second + intFirstNum + intSecondNum);
		//숫자 다 더하고 문자열로 바뀜
		System.out.println(intFirstNum + intSecondNum + firstNum + second);
		//문자됨
		System.out.println(firstNum + intFirstNum);
	}
}
