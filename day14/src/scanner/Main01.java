package scanner;
//scanner셋팅
/*
 *  scanner.next() 	: 공백 전 까지 입력받음
 *	scanner.netine()	: 한줄 전체를 입력받음
 */
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("int type 입력 : " );
		int i = scanner.nextInt();
		System.out.println("int 결과 : "+ i);
		
		
		
		
		
		
		
		
		
		
		
		scanner.close(); //마지막에는 닫아준다.
		
	}

}
