package interfaceobject;

public class Charactor implements Action, Fight, Move {

	private String name;

	public Charactor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name+" 다가가기");
	}

	@Override
	public void run() {
		System.out.println(this.name+" 달려가기");
	}

	@Override
	public void jump() {
		System.out.println(this.name+" 뛰기");
	}

	@Override
	public void attack() {
		System.out.println(this.name+" 공격하기");
	}

	@Override
	public void shield() {
		System.out.println(this.name+" 막기");
	}

	@Override
	public void pickup() {
		System.out.println(this.name+" 아이템 줍기");
	}

	

	
	
	
}
