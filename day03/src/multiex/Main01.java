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



		System.out.print("결과 값 : ");
		for (int i = 1; i<= 9; i++ ) {
				//1~9까지 곱샘진행
			System.out.print(+ 7* i+" " );
							//7단만의 값을 구하므로 7값 고정
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
			
			a02++;			//1~9까지 곱값에 해당
			
			System.out.print(+7*a02 + " " );
							//7단은 고정값이므로 7고정
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
			int b03 = 7* b01;	//7단 고정
			System.out.print(+ b03 + " ");
		} while (b01<=8); 		//1~9까지 곱샘진행
		

		
		
		
		
		System.out.println();
		System.out.println("------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
