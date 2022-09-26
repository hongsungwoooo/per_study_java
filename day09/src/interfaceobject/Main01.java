package interfaceobject;

public class Main01 {

	public static void main(String[] args) {

		Charactor charactor = new Charactor("주인공");
		Monster monstor = new Monster("몬스터");
		
		System.out.println("몬스터를 마주했다");
		
		charactor.run();
		monstor.jump();

		monstor.attack();
		charactor.shield();
		
		charactor.attack();
		monstor.shield();
		
		System.out.println("몬스터가 쓰러졌다");
		
		charactor.pickup();
		
		
		
		
	}
}	


