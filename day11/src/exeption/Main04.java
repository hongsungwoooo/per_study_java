package exeption;
//예외처리 try구문
public class Main04 {

	public static void main(String[] args) {
		try {
			String year2 = "뭘까";
			int age2 = 2022 - Integer.parseInt(year2) + 1;
			System.out.println(age2);
		}catch(NumberFormatException e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());
			
			e.printStackTrace(); 					//예외에대한 처리를 전체적으로 출력하는 메서드
		}
		System.out.println("--- 프로그램을 종료합니다 ---");
	}
}
