package condition;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고,
		 * 그렇지 않으면 걸어가라
		 */ 
		int cash = 2000;
			if( cash >= 3000 ) {
				System.out.println("택시탑승");
			} else
				System.out.println("걸어가라");
	
		System.out.println("--------------------------------");
		/*
		 * 2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 
		 * 그렇지 않다면 걸어가라
		 */
		
		int cash2 = 2000;
		String card = "no";
			if( cash2 >=3000 || card == "yes") {
				System.out.println("택시탑승");
			} else if (cash2 < 3000 || card != "yes") {
				System.out.println("걸어가라");
			} 
			
			
		System.out.println("--------------------------------");
		
		
		//답안
		int money2 = 1000;
		boolean hascard = true;
		if ( money2 >= 3000 || hascard) {
			System.out.println("택시를타고가라");
		}else {
			System.out.println("걸어가라");
		}
		
		
		System.out.println("--------------------------------");
		/*
		 * 3. 어떤 특정 정수 a가 짝수 이면 "짝수", 홀수이면 "홀수"라고 출력
		 */
		int a2 = 10;
		
		if( a2 %2 == 0) { //짝수일경우
		System.out.println("짝수");
		} else {			//홀수일경우
		System.out.println("홀수");
		}
		
		
		System.out.println("--------------------------------");
		/*
		 * 4. 서로다른 a,b,c의 최대값을 구하여라 
		 */
		int a = 10;
		int b = 20;
		int c = 9;
		
		if(a > b && a > c) {
			System.out.println( a );
		}else if(b > a && b >c) {
			System.out.println( b );
		}else if(c > a && c > b) {
			System.out.println( c );
		}
		
		
		//답안
		int max =0;
		if( a > b && a > c) {
			max = a;
		} else {
			if( b > c ) {
				max = b;
			}else {
				max = c;
			}
		}
		
		System.out.println("최대값 : " + max);
		
		System.out.println("--------------------------------");
		/*
		 * 5. 숫자가 3이면 안녕"3줄", 2이면 "안녕"이 두줄,
		 * 1이면 "안녕"이 한줄, 그 외에는 "잘가"를 출력
		 */
		int point = 3;
			if(point == 3 ) {
				System.out.println("안녕");
				System.out.println("안녕");
				System.out.println("안녕");
			} else if(point == 2){
				System.out.println("안녕");
				System.out.println("안녕");
			} else if(point == 1){
				System.out.println("안녕");
			} else if(point > 3 || point < 1) {
				System.out.println("잘가");
			}
			
			
			
			//답안
		int num = 0;
			switch(num) {
			case 3:
				System.out.println("안녕");
			case 2:
				System.out.println("안녕");
			case 1:
				System.out.println("안녕");
			break;
			default :
				System.out.println("잘가");
			} 



		System.out.println("--------------------------------");
		
		
		
	}

}
