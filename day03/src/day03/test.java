package day03;

public class test {

	public static void main(String[] args) {

		int sum = 0;
		// (1)초기식    (2)(5)조건식 	(4)증감식
		for (int i =1;    i<=100;	   i++) {
			
			//(3)반복적으로 동작할 구문
			sum += i;
			
			System.out.println(sum); //(for문이 반복되는과정을 출력)
			
		}
		
		System.out.println(sum); //(최종결과값만을 출력)
		
		
	}

}



























