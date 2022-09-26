package staticobject;
//싱글톤
public class Calc {
	// ---------------------------- 싱글톤 객체 생성을 위한 준비 시작
	/*
	 * static이 적용된 자원은 메모리의 고정영역에 생성되기 때문에,
	 * 클래스 자체의 객체나, 그 안에 포함된 멤버변수, 메서드와는 메모리 상에서 구별된다고 볼 수 있다.
	 * - 그러므로 Calc 클래스 안에 static 형태로 Calc 클래스의 객체를 정의하더라도 
	 *  실제로는 Calc 클래스 자체에서 독립된 객체가 되는 것이다
	 *  - Calc 클래스 이외의 여러 곳에서 new 연산자를 사용하여 객체 할당이 가능하다면
	 *  SingleTon이라는 개념 자체가 성립되지 않으므로, 외부에서 이 객체에 직접적인 
	 *  접근을 못하도록 은닉시킨다.
	 */
	private static Calc current;
	
	//객체가 할당되지 않은 경우에만 할당하도록 하여 중복 할당을 방지한다.
	public static Calc getInstance() {
		
		if (current == null ) {
			current = new Calc();
		}
		
		return current;
		
	}
	
	//객체에 null을 대입하면 메모리에서 삭제된다.
	public static void freeInstance() {
		current = null;
	}
	
	// 기본 생성자를 private 형태로 정의하면 객체 생성자가 은닉 처리되어
	// 외부에서 new 연산자를 사용한 객체할당이 금지된다.
	private Calc() {}	
	
	
	//----------------------------- 싱글톤 객체 생성을 위한 준비 끝
	public int plus (int x, int y) {
		return x+y;
	}
	public int minus (int x, int y) {
		return x-y;
	}
	
}
