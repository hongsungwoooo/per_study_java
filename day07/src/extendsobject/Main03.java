package extendsobject;
//Override 예시 - 한눈에 보기위해 여러클래스 한파일에 생성함(수업편의)

class Hello{									//부모
	public void say() {
			System.out.println("Hello");
	}
}

//------------------------------------------

class English extends Hello{ }					//자식,상속만받고 끝

//------------------------------------------

class Japaness extends Hello{ 
	public void say() {
		System.out.println("おはよう");
	}
}
//------------------------------------------
class Korean extends Hello{
	public void say() {							//부모클래스 Hello에 정의되어있는 say() 메서드를 재정의(override)
		System.out.println("안녕하세요");
	}
}

public class Main03 {

	public static void main(String[] args) {
		English e = new English();
		e.say();								// 부모클래스에 정의된 say메서드 호출(기본 상속의 개념)
												// 자식 클래스에 구현된 메서드가 없기 때문에, 부모 클래스에 정의된 메서드를 찾아가게 된다.
												// English메서드에는 say가 재정의 되지않음
		
		Korean k = new Korean();				// 자식클래스가 부모와 같은 이름의 메서드를 정의하고 있기 때문에,
		k.say();								// k객체에게는 부모 클래스가 정의하고 있는 say()메서드가 가려지게 된다.
		
		Japaness j = new Japaness();
		j.say();
		
	}

}
