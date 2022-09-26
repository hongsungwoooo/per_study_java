package staticobject;
//싱글톤
public class Main02 {

	public static void main(String[] args) {
//		Calc c1 = new Calc() 
//			int a = c1.plus(20, 10);
//	
//		Calc c2 = new Calc()
//		int b = c1.minus(20, 10)
//		
		
//		Calc c3 = new Calc();
//		int c = c3.plus(20,10);
//		int d = c3.minus(20, 10);
		
		/* 
		 * 싱글톤 객체 사용하기
		 * - getInstance() 메서드를 사용하여 객체를 리턴 받는 형식으로 사용한다.
		 * - 여러 객체를 리턴받더라도 모두 하나의 static 객체를 참조하기 때문에
		 * 전역 객체 하나만이 메모리에 할당하게 된다.
		 * 
		 */
		
		// 싱글톤 사용하는 방법
		Calc c = Calc.getInstance();
		int e = c.plus(20, 10);
		System.out.println(e);
		
		System.out.println(Calc.getInstance().minus(20,10));
		
		
	}

}
