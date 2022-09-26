package interfaceobject;

public class Monster implements Fight, Move {

	private String name;

	public Monster(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println(this.name+" 다가오기");
	}

	@Override
	public void run() {
		System.out.println(this.name+" 달려들기");
	}

	@Override
	public void jump() {
		System.out.println(this.name+" 뛰어들기");
	}

	@Override
	public void attack() {
		System.out.println(this.name+" 공격하기");
	}

	@Override
	public void shield() {
		System.out.println(this.name+" 방어하기");
	}

}
