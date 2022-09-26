package multiex;

public class Main04 {
//break continue
	public static void main(String[] args) {
		//1부터 100까지 홀수들의 합

		int sum = 0;
		int i = 0;
		
		while (true) {
			i++;
			
			if ( i % 2 == 0 ) { // 짝수
				
				continue;		// 짝수라면 증감식으로 계속진행
				
			}
			if ( i > 100 ) {
				
				break;
				
			}
		
			sum += i;			//홀수인경우
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
