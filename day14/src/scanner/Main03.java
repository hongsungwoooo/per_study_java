package scanner;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		System.out.println("----- 회원가입을 시작합니다 -----");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String str1 = scanner.nextLine()	;
		System.out.println(str1);
		
		if(str1.length()>11) {
			System.out.println("아이디는 10자 이하의 글자로만 입력해 주세요");
		} else {
			System.out.println("입력하신 아이디 " + str1 + "로 회원가입을 시작합니다.");
		}
		
		
		scanner.close();
	}

}
