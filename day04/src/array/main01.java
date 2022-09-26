package array;

public class main01 {
//배열의 생성,활용
	public static void main(String[] args) {

		// 배열의 생성
		
		int[] dooly; 
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		
		// 배열의 선언과 크기 지정의 일괄처리
		
		int[] douneo = new int[3];	// 여러개의 int형 변수를 저장할 수 있는 배열의 선언
		douneo[0] = 88;				// 배열의 칸을 3칸으로 할당
		douneo[1] = 64;
		douneo[2] = 50;
		
		
		// 배열 생성의 일괄처리
	
		int[] ddochy = new int[] {100, 100, 90};
		
		
			
		
		
		// 배열의 활용
		// 반복문 각각의 총합, 평균 출력까지
		int sum = 0;
		for(int i =0; i<dooly.length; i++) {
			sum += dooly[i];
		
		
		}	System.out.println(+sum+" " +sum/3);

		System.out.println("--------------------");
		
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		for( int i = 0; i<dooly.length; i++) {
			sum1 += dooly[i];
		}
		System.out.println("둘리의 총합"+sum1+" 둘리의 평균 " +sum1 / dooly.length);
		
		for( int i = 0; i<douneo.length; i++) {
			sum2 += douneo[i];
		}
		System.out.println("도우너의 총합"+sum2+" 도우너의 평균 " + sum2 /douneo.length);
		
		
		for( int i = 0; i<ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		System.out.println("또치의 총합"+sum3+" 또치의 평균 " + sum3 / ddochy.length);
		
		
		
		
		
		
		
	}

}
