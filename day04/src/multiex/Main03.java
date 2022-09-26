package multiex;

public class Main03 {

	public static void main(String[] args) {
		
		/*
		 * 7. 이중 반복문(8*8)을 사용해서 별을 출력 
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 *   ★★★★★★★★
		 */
		for (int a = 0; a<8; a++) {
			for(int b= 0; b<8; b++ ) {
			System.out.print("★");
			}
			System.out.println(""); //끝나는시점에 엔터가들어가는개념
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		System.out.print("");
		/*
		 * 8. 이중 반복문(8*8)을 사용해서 별을 출력 
		 *   ★★★★★★★★
		 *   ★★★★★★★
		 *   ★★★★★★
		 *   ★★★★★
		 *   ★★★★
		 *   ★★★
		 *   ★★
		 *   ★
		 */
		
		//답안
		for( int i = 0; i <=7; i++) {
			for( int j = i; j<=7; j++ ) {
				System.out.print("★");
			}
				System.out.println("");
		}
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		
		
		

		for (int e = 0; e<8; e++) {
			System.out.print("★");
			for(int f= 7; f>e; f-- ) {
			System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		/*
		 * 9. 이중 반복문(8*8)을 사용해서 별을 출력 
		 *   ★
		 *   ★★
		 *   ★★★
		 *   ★★★★
		 *   ★★★★★
		 *   ★★★★★★
		 *   ★★★★★★★
		 *   ★★★★★★★★
		 */
	
		
		
		for( int i = 7; i>=0; i-- ) {
			 for(int j=i; j<=7; j++)  {
				 System.out.print("★");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		
		for (int c = 0; c<8; c++) {
			System.out.print("★");
			for(int d= 0; d<c; d++ ) {
			System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");

		/*
		 * 10. 10번찍어 안 넘어 가는 나무 없다 라는 문구를 출력
		 *   (단, while문으로 작성할 것)
		 *   결과 :  나무를 1번 찍었습니다.
		 *   		나무를 2번 찍었습니다.
		 *   		나무를 3번 찍었습니다.
		 *   		....
		 *   		나무를 10번 찍었습니다.
		 *   		나무가 넘어갔습니다. 
		 *   
		 */
		
		
		int g = 0;
		int h = 1;
		
		while(g<10) {
			g += h;
			System.out.println("나무를 "+g+ "번 찍었습니다.");
		}System.out.println("나무가 넘어갔습니다.");
				
		
		
		
		
		
		System.out.println("---------------------------------------------");
	
		//답안
		int treeHit = 0;
		while (treeHit < 10) {
		
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다");
		
			if (treeHit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
