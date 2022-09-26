package string;
//연습문제
public class Main02 {

	public static void main(String[] args) {
		// 1. 이메일 주소에서 아이디와 도메인을 구별하기
		// 단, splite 사용금지
		
		String email = "student@java.com";
		
		String id = email.substring(0,7);
		String domain = email.substring(8);
		System.out.println("아이디 : "+id);
		System.out.println("도메인 : "+domain);
		
		// 결과 -> 아이디 : student
		// 결과 -> 도메인 : java.com
		
		//강사님답안
		//@가 나타나는 위치 얻기
		int s = email.indexOf("@");
		//처음부터 @가 나타나는 위치까지 자르기->id
		String email_id = email.substring(0,s);
		
		//@가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(s+1);
		
		//결과 : 아이디 
		System.out.println("아이디 : "+ email_id);
		
		System.out.println("도메인 : "+ email_domain);
		
		
		
		
		
		
		
	}

}
