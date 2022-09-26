package scanner;

import java.util.Scanner;
/*
 *  scanner.next() 	: 공백 전 까지 입력받음
 *	scanner.netine()	: 한줄 전체를 입력받음
 */
public class Main02 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("문자열 입력 : "); //  println문은 밑에서 입력받는다. 안녕하세요 오늘은 금요일
	String str1 = scanner.nextLine();
	System.out.println(str1);
		
	System.out.println("문자열 입력 : ");   //안녕하세요 오늘은 금요일 -> 안녕하세요 만 출력
	String str2 = scanner.next();
	System.out.println(str2);
		
		
		
	scanner.close();
		
	}

}
