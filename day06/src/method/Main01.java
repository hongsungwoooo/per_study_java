package method;

public class Main01 {
//메서드
	public static void main(String[] args) {
		//메서드의 값을 변수에 저장
		int a =	plus(10, 5); //15
		System.out.println(a);
		
		System.out.println(f1(30));
		
		
	}
	
	public static int plus(int x, int y) { //10, 5
		return x + y; //15를 메인메서드로 리턴
	}
	
	public static int f1( int x) {
		int y= x + 1;
		return y;
	}
	
}
