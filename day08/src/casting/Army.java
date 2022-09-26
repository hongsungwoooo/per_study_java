package casting;

public class Army extends Unit {

	public Army(String name) {				//상속	
		super(name);
	}
	// override 메서드
	// 공격의 형태를 육군에 맞게 변경하지만, 부모 클래스가 가지고 있는 
	// 공격 준비 기능을 super 키워드를 사용해서 호출하려고 함.

	@Override// ( 부모메서드재정의 )//에러자동확인 (부모클래스에 없는 내용 빨간줄로 체크해줌) 
	public void attack() {
		super.attack(); 											//부모매서드의 "공격준비"출력
		System.out.println(this.getName() + ">>> 지상공격 실행함");		//육군에 맞는 공격명령 출력
		System.out.println(this.getName() + ">>> 전진");
	}
	
	public void tank() {
		System.out.println(this.getName() + ">>> 탱크공격");
	}
}