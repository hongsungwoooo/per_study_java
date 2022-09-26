package part02;

public class Main03 {
//3번
	public static void main(String[] args) {

		/*3.

		방정식 2x+4y=10  의 모든 해를 구하시오.  단 x 와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다. (10)

		[출력 결과]

		x=1, y=2

		x=3, y=1

		x=5, y=0
		 */
		
		System.out.print("     결과 값   ");
		System.out.println();
	for(int i = 0; i <= 10; i++) {
		for(int j = 0; j <= 10; j++) {
			
			if( ( ( 2 * i )+( 4 * j ) ) == 10 ) {
				System.out.print(" x = "+ i +",  y = " +j);
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}
		
		
		
		
		
		
		
		
		
		
	}

}
