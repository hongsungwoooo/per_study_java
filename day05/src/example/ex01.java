package example;

public class ex01 {

	public static void main(String[] args) {

		
		//3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
		String[][] sum = new String[3][3];
		for(int i = 0; i < sum.length; i++) {
			for( int j = 0; j < sum[i].length; j++) 
				System.out.print("(" + i +"," + j+ ")" );
				System.out.println();
			
		}
		
		
			String[][] arr = new String[3][3];
			
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++)
					System.out.print("(" + row + ", " + col + ")");
				System.out.println();
			}
	
			
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
