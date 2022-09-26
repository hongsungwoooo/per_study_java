package loop;

public class Main03 {

	//do~while문
	public static void main(String[] args) {
		
		
		//1 + ... + 100
		//(초기식)
		int sum = 0;
		int i = 1;
		
		
		do {
			//(2)(5) 반복적으로 동작할 구문(최초 1회는 반드시 실행)
			sum += i;
			//(3) 증감식
			i++;
		
			System.out.println(sum);
				 //(4) 조건식
		} while ( i <= 9 );
		

		
		
		
	}

}
