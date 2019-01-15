package icehs.science.ch08;

public class IdolTest {

	public static void main(String[] args) {
		Idol[] idols = {
				new Idol("소녀시대", "태연"),	
				new Idol("시스타", "보라")	,
				new Idol("우주대폭발", "G용"),
				new Idol("비스트", "양오섭")
		};
		/*
		 * System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		 * System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
		 * System.out.println(idols[2].getGroup() + " : " + idols[2].getName());
		 * System.out.println(idols[3].getGroup() + " : " + idols[3].getName());
		 */
		for (int i = 0; i < idols.length; i++) {
			System.out.println( idols[i].getGroup() + " : " + idols[i].getName() );
		}

	}
}
