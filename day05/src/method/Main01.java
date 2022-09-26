package method;

public class Main01 {
//메서드
	// main 이라는 메서드
	// 프로그램의 시작점 이라는 의미
	public static void main(String[] args) {
		plus(); 											//plus메서드 호출 
		plus(); 
		minus();
	}
	public static void plus() {								//main메서드에서 호출해야지만 실행됨
		int x = 100;
		int y = 200;
		System.out.println( x + y );
	}
	public static void minus() {
		int x = 200;
		int y = 100;
		System.out.println( x - y );
	}
	
	
	
	
	
	
	
	
	
	
}
