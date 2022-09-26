package patterncheck;
//정규표현식 배포메모자료참조
import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		// 회원 가입시에 입력한 내용을 가정한 변수값들
		String name = "자바학생";
		String age = "19";
		String email = "student@java.net";
		String phone = "01012345678";
		
		// 한글여부
	
		boolean isKor =  Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
		
		if(!isKor) {
			System.out.println("이름은 한글로 입력해주세요.");
			//실행도중 return을 만나면 즉시 중단.
			//void 형은 return 키워드만 명시한다.
			return;//name변수가 틀렸기때문에 밑문장은 실행되지 않는다 
		}
		
		// 숫자인지 검사
		boolean isNum = Pattern.matches("^[0-9]*$", age);
		if(!isNum) {
			System.out.println("나이는 숫자로만 입력해 주세요.");
			return;
		}
		
		boolean isEmail = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email);
		if (!isEmail) {
			System.out.println("이메일 형식이 맞지 않습니다.");
			return;
		}
		boolean isPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone);
		if(!isPhone) {
			System.out.println("전화번호 형식이 맞지 않습니다.");
			return;
		}
		System.out.println("회원가입 절차를 진행합니다.");
	}

}
