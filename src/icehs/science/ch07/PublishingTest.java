package icehs.science.ch07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication pub1 = new Publication();
		pub1.setTitle("��ȭ �ﱹ�� SE");
		pub1.setPage(300);
		pub1.setPrice(350000);
		
		System.out.println("====���ǹ� ������ �����մϴ�.=====");
		pub1.setPage(-1000);
		pub1.setPrice(-5000);
		pub1.printPublicationInfo();
		
		System.out.println("���ǹ� ���� : " + pub1.getTitle() + " (" + pub1.getPrice() + "��, " + pub1.getPage() + "������)"); 

	}

}
