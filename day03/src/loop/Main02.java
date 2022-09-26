package loop;

public class Main02 {
//while문
	public static void main(String[] args) {
		// 1 + 2 + ... + 100
		
		//(1)초기식
		int sum = 0;
		int i = 1;
		
			//(2)(5)조건식
		while( i <= 100 ) {
			
			//(3)반복적으로 동작할 구문..
			sum += i;
			
			//(4)증감식
			i++;
			System.out.println(i);
		}
		System.out.println(sum);
	
	}

}
