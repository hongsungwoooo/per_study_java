package string;
//연습문제
public class Main03 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일 추출하기
		 * - 주민등록번호 :8005011234567 -> 1980년 05월 01일 남자
		 * - 태어난 년도의 판별 	: 1or 2 -> 19~
		 *  				: 3or 4 -> 20~
		 * - 성별의 판별 	: 1 or 3 -> 남자
		 * 				: 2 or 4 -> 여자
		 * 
		 */
		
		String num = "8005011234567";
		String sub_num = num.substring(0,2);
		String sub_num2 = num.substring(2,4);
		String sub_num3 = num.substring(4,6);
		String sub_num4 = num.substring(6,7);
		String sub_num5 = sub_num4.replace("1","19");
		boolean birth = sub_num4.equals("1");
		boolean gender = sub_num4.equals("1");
		
		
		System.out.println(num);
		System.out.println("생년월일 : "+sub_num5+sub_num+"년 "+sub_num2+"월 "+ sub_num3+"일");
		
		
		if(gender) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		if(birth) {
			System.out.println("1900년대 출생");
		}else {
			System.out.println("2000년대 출생");
		}
		
		// 강사님답안
		String jumin = "8005011234567";
		// 주민등록번호를 년, 월, 일 단위로 각 두 글자씩 자르기
		String yy = jumin.substring(0,2);
		String mm = jumin.substring(2,4);
		String dd = jumin.substring(4,6);
		
		// 뒷부분의 첫 번째 글자는 성별코드이므로 별도로 추출한다.
		String gender_code = jumin.substring(6,7);
		
		// 태어난 년도 판별
		if(gender_code.equals("1")||gender_code.equals("2")) {
			yy = "19"+yy;
		}else {
			yy = "20"+yy;
		}
		
		// 기본 성별은 남자
		String gender1 = "남자";
		if(gender_code.equals("2")||gender_code.equals("4")) {
			gender1="여자";
		}
		
		//System.out.printf();-> String.format + System.out.println
		System.out.printf("%s년 %s월 %s일 %s", yy, mm, dd, gender1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
