package multiex;

public class Main02 {

	public static void main(String[] args) {
		
		/*
		 * 4. 1 ~ 100까지 중에 홀수와, 짝수의 합을 각각 구하여라
		 * 
		 */
		
		int a03 = 1;
		int a04 = 1;
			while( a03<=100) {
				a04 += a03;
				a03+=2;

			}
	
		
		
		int a01 = 0;
		int a02 = 2;
			while( a01<=100) {
				a02 += a01;
				a01+=2;
			
			}
			

			
			System.out.println("짝수의 합:" + a02 +  ", 홀수의 합 :" + a04  );
		
		System.out.println("---------------------------------------------");
		
		/* 
		 * 5. 구구단 2단부터 9단까지의 결과값만을 출력하라(2중 반복문)
		 * 단, 단수가 바뀔때마다 구분자를 넣어줄것-----
		 * ( 결과 :  2
		 * 			4
		 * 			...
		 * 			18
		 * 			------
		 * 			3
		 * 			6
		 * 			...
		 * 			27
		 * 			---
		 * 			.....
		 */
		
		for(int bb01 = 2; bb01<=9; bb01++) {
			System.out.println("----"+bb01+"단-----");
		for(int bb02= 1; bb02<=9; bb02++) {
			System.out.println(bb01 +" x "+ bb02+ " = " +(bb01*bb02));
		}
		}
		
		
		
		for(int cb01 = 2; cb01<=9; cb01++) {
			System.out.println("----"+cb01+"단-----");
		for(int cb02= 1; cb02<=9; cb02++) {
			System.out.println(+(cb01*cb02));
		}
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------");
		
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(2 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(3 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(4 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(5 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(6 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(7 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(8 * b02);
		}System.out.println("---------");
		for(int b02 = 1; b02<=9; b02++ ) {
			System.out.println(9 * b02);
		}System.out.println("---------");
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		
		/*
		 * 6. 구구단 2단을 출력하고,
		 * ( 2 * 1 = 2 )
		 * ( 2 * 2 = 4 )
		 * ....
		 * ( 2 * 9 = 18)
		 * 과정식까지 출력하라
		 */
		
		
		for(int b03 = 1; b03<=9; b03++ ) {
			int b04= 2* b03;
			String b05 = "=";
				System.out.println("2*"+ b03 +b05 +b04);
		}
		
		
		for(int b06 =1; b06<=9; b06++) {
			System.out.println("2 * " + b06 + " = " + 2*b06);
		}

		
		System.out.println("---------------------------------------------");
	
		
		
		
		
		
	}

}
