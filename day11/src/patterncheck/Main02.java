package patterncheck;
//RegexHelper활용
public class Main02 {

	public static void main(String[] args) {
		String name = "자바학생1";
		String age = "19";
		String email = "student@java.net";
		String phone = "01012345678";

		
		// RegexHelper에서 만든 메서드 사용해서 데이터검증
		if(!RegexHelper2.getInstance().isKor(name)) {	//RegexHelper에 결과값만을 출력하므로 !로 부정과정처리
			System.out.println("이름은 한글로 입력해 주세요");
			return;
		}
		if(!RegexHelper2.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해 주세요");
			return;
		}
		
		
		
		
		
		
		
		
		
		System.out.println("회원가입 절차를 진행합니다.");
	}

}
