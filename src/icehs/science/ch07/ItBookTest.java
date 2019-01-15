package icehs.science.ch07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		System.out.println(sql.NO_OF_OBJECT);
		ItBook java = new ItBook("java 2.0", 28000, 3.2);
		System.out.println(java.NO_OF_OBJECT);
		ItBook jsp = new ItBook("JSP servlet", 37000, 6.9);
		//System.out.println(jsp.NO_OF_OBJECT);
		System.out.println(ItBook.NO_OF_OBJECT);
		sql.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		System.out.println("SQL Plus ������ ���η��� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		
		System.out.println("Java 2.0 ������ �����մϴ�.");
		java.setPrice(33000);
		java.printItBookInfo();
		System.out.println("JSP Servlet ����� ���η��� �����մϴ�.");
		java.setTitle("Servlet & JSP");
		java.setDiscountRate(9.5);
		java.printItBookInfo();
	}

}
