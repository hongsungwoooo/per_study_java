package method;
// 파라미터를 갖는 메서드의 호출

public class Main02 {

	public static void main(String[] args) {
		plus(10, 20);  //매개 변수가 정이되어있기때문에 담아서 호출
		minus(20, 10);
		multi(10, 20);
		divi(10, 200);
		
	
		
		
	}
							// 10    20
	public static void plus( int x, int y){
		System.out.println( x + y );	//30
		
	}
							// 20     10
	public static void minus(int x , int y) {
		System.out.println( x - y );	//10
	
	}
							// 10    20	
	public static void multi(int x, int y) {
		System.out.println( x * y );	//200
	}
	
	public static void divi(int x, int y) {
		System.out.println( x %= y );
	}
	
}
