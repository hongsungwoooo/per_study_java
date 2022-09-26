package loop;
//for문
public class Main01 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		      //(1)초기식    (2)(5)조건식		(4)(증감식)
		for (int i = 0;     i <= 9;      i++) {
		
			//(3) 반복적으로 동작할 구문
			sum += i;
			
		System.out.println("i : " + i + ", sum : " + sum);
			
		}
		
		
		System.out.println(sum);
		
		
		
		
	}

}
