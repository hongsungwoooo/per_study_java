package boxing;

public class AirForce extends Unit {

	public AirForce(String name) {				//상속	
		super(name);
	}
	public void attack() {
		super.attack(); 											//부모매서드의 "공격준비"출력
		System.out.println(this.getName() + ">>> 공중공격 실행함.");
		System.out.println(this.getName() + ">>> 이륙!");
	}
	public void bombing() {
		System.out.println(this.getName() + ">>> 폭격");
}
}