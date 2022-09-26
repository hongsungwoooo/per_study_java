package typing;

import java.util.Scanner;

public class TypingAction {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String inputData = "";
		
while(true) {																//처음 으로 되돌아 오기 위한 초기 무한루프while문																							
	try {																	//지정된 선택지 외의 값을 입력했을 시 예외처리를 위한 try catch
	System.out.println("[\t\t  - 한/영 타자연습 프로그램 -\t\t]");					
	System.out.println("[\t\t- 원하는 연습 모드를 입력하세요 -\t\t]");
	System.out.print("[\t\t[1]한글 속담연습\t[2]영문 속담연습\t\t]");
	System.out.println("");
	System.out.println("");
	inputData = scan.nextLine();											//스캐너를 통한 연습모드 선택	1 / 2 선택
	System.out.println("");
	

	
	int count = 0;															//타자 연습 시입력값이 정답일경우 길이가1씩증가하며 출력하기 위한 변수선언
	int count1 = 0;
	
	if(inputData.equals("1")) { 											// 1 한글 속담연습 선택시 실행될 조건문
		System.out.println("입력하세요!");
			for(int i = 0; i <= WordBook.word.length;  i++) {				// 문장이담긴 배열의 길이를 호출하여 출력후 종료할 반복문 for
					if(i >= WordBook.word.length) {
						System.out.println("수고하셨습니다.");
						break;
					}
						System.out.println(WordBook.word[count]);
						String inputData1 = scan.nextLine();				// 문장의 띄어쓰기와 대소문자값까지 입력받기위한 nextLine()
					if(inputData1.equals(WordBook.word[count] ) ) {
						System.out.println("정답!");
						count+=1;											// 정답일 경우 1씩 증가하며 출력
					}else {
						System.out.println("틀렸습니다!");						// 오답 일경우 y선택시 count는 증가하지 않고 다시 시행
						System.out.println("다시 입력 하시겠습니까? [y/n]");		// 이외의 값을 입력시 break문을 통한 초기 메뉴진입
						String inputData2 = scan.nextLine();				
						if(inputData2.equals("y")) {
							count -=0;
						}else {
							System.out.println("처음으로 돌아갑니다.");
							break;
						}
					}
			}	// if-for
	} // 한글속담끝 
	
		if(inputData.equals("2")) {											//영문 속담 조건문
			System.out.println("입력하세요!");
			for(int i = 0; i <= WordBook.word2.length;  i++) {
					if(i >= WordBook.word2.length) {
						System.out.println("수고하셨습니다.");
						break;
					}
				System.out.println(WordBook.word2[count1]);
				String inputData1 = scan.nextLine();
			if(inputData1.equals(WordBook.word2[count1] ) ) {
				System.out.println("정답!");
				count+=1;
				
			}else {
				System.out.println("틀렸습니다!");
				System.out.println("다시 입력 하시겠습니까? [y/n]");
				String inputData2 = scan.nextLine();
				if(inputData2.equals("y")) {
					count -=0;
				}else{
					System.out.println("처음으로 돌아갑니다.");
					break;
				}
			}
			}
		} // 영문속담끝

		if(inputData != "1" || inputData!="2")  {							//초기 메뉴의 보기값 외의 값이 입력될 경우 예외 투척
			throw new Exception();											
		}

			
		}  catch(Exception e) {												
		System.out.println("[ \t 처음으로 되돌아갑니다.\t]");
		System.out.println("");
			continue;
		}
		}
		
	}
}

	
	

