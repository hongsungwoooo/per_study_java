package casting;

public class Navy extends Unit{

	public Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(this.getName() + ">>> 해상공격 실행");
		System.out.println(this.getName() + ">>> 지상 상륙");
	}
	public void nucleus() {
		System.out.println(this.getName() + ">>> 핵미사일");
}
}