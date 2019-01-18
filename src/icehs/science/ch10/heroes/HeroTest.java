package icehs.science.ch10.heroes;


public class HeroTest {
	public static void main(String[] args) {
		
		Hero [] heroes = {
				new SuperMan(),
				new BatMan(),
				new SpiderMan(),
				//new Hero()
		};
		System.out.println("[Hero 목록 : 슈퍼맨, 배트맨, 스파이더맨");
		
		for (int i = 0 ; i < heroes.length; i++) {
			heroes[i].action();
		}
}
}
