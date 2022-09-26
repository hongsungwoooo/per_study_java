package multiex;

public class Main01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 7의 (구구단의)배수의 결과값만을 출력
		 * 	  단, for문으로 작성할것
		 * 
		 * 	(결과 값 : 7 14 21..63)이런식으로작성
		 * 
		 */

		

		System.out.print("-------------------");
		System.out.print("결과 값 : ");
		for (int ai = 1; ai<= 9; ai++ ) {
			
			System.out.print( + 7 * ai + " " );
		
		}
		
		
		
	System.out.println();	
		
		
	System.out.println("------------");
		/*
		 * 2. 7의 (구구단의)배수의 결과값만을 출력
		 * 	  단, while문으로 작성할것
		 * 
		 * 	(결과 값 : 7 14 21..63)이런식으로작성
		 * 
		 */
		
	System.out.print("결과 값 : ");
		int a02 = 0;
		while( a02 <=8 ) {
			a02++;
			System.out.print(+7*a02 + " " );
			
		}
		
		
		
		
		System.out.println();
		System.out.println("------------");
		/*
		 * 3. 7의 (구구단의)배수의 결과값만을 출력
		 * 	  단, do~while문으로 작성할것
		 * 
		 * 	(결과 값 : 7 14 21..63)이런식으로작성
		 * 
		 */

		System.out.print("결과 값 : ");
		int b01 = 0;
		int b02 = 1;
		
		do {
			b01 += b02;
			b02+=0;
			int b03 = 7* b01;
			System.out.print(+ b03 + " ");
		} while (b01<=8);
		

		
		
		
		
		System.out.println();
		System.out.println("------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
