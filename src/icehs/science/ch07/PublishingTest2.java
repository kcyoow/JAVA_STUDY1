package icehs.science.ch07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samgookji = new Publication();
		Publication piStory = new Publication();
		samgookji.setTitle("��ȭ �ﱹ��");
		samgookji.setPage(300);
		samgookji.setPrice(5000);
		samgookji.printPublicationInfo();
		piStory.setTitle("���� �̾߱�");
		piStory.setPrice(8400);
		piStory.setPage(314);
		piStory.printPublicationInfo();
		
		
	}

}
