package object;

class Calc2{

	int sum(int x, int y) { return x + y; }
	int minus (int x, int y) { return x - y; }
	int multi (int x, int y){ return x * y; }
	int divide (int x, int y) {
		int result = x/y;
		if( y!=0) {
		}
		return result;
	}
	
	//0으로 나눠주는 처리를 해야하기 때문에
	//내답 int divide (int x, int y) { return x / y; } //0으로 나누었을때를 고려하지않음
	
	// 데이터 타입은 전체 int

	// 덧셈 결과 return, 파라미터 2개 메서드 생성

	// 뺄셈 결과 return, 파라미터 2개 메서드 생성

	// 곱셈 결과 return, 파라미터 2개 메서드 생성

	// 나눗셈 몫에 대한 결과 return, 파라미터 2개 메서드 생성
}

public class Main05 {

	public static void main(String[] args) {
		//Calc2 클래스로 객체 생성후
		//덧셈
		//뺄셈
		//곱셈
		//나눗셈
		//결과를 각각 출력
		
		Calc2 c1 = new Calc2();
										/*int a = c1.sum   (30, 10); 			//내답
									      int b = c1.minus (30, 10);
										  int c = c1.multi (30, 10);
										  int d = c1.divide(30, 10);
										*/
		
		System.out.println("30 + 10 = " +c1.sum   (30, 10));	//강사님 답 
		System.out.println("30 - 10 = " +c1.minus (30, 10));
		System.out.println("30 * 10 = " +c1.multi (30, 10));
		System.out.println("30 / 10 = " +c1.divide(30, 10));
		
	}

}
