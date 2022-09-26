package patterncheck;
//싱글통응용//검증에 대한 코드를 정리
import java.util.regex.Pattern;


public class RegexHelper2 {
	//싱글톤 객체 생성
	private static RegexHelper2 regexhelper;
	public static RegexHelper2 getInstance() {
		if (regexhelper == null) {
			regexhelper = new RegexHelper2();
		}
		return regexhelper;
	}
	
	public static void freeInstance() {
		regexhelper = null;
	}
	private RegexHelper2() { }
	/*
	 * 주어진 문자열이 공백이거나 null인지 검사
	 * @param	str 		- 검색할 문자열
	 * @return 	boolean		- 공백, null이 아닐 경우 true 리턴
	 */
	public boolean isValue(String str) {
		boolean result = false;
		if(str != null) {
			result = !str.trim().equals("");
		}
		return result;
	}
	
	/*
	 * 숫자 모양에 대한 형식검사
	 * @param	str			- 검사할 문자열
	 * @return 	boolean		- 형식에 맞을경우 true, 맞지 않을 경우 false
	 */
	public boolean isNum(String str) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		return result;
	}
	
	/*
	 * 영문으로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return 	boolean		- 형식에 맞을경우 true, 맞지 않을 경우 false
	 */
	public boolean isEng(String str) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		return result;
	}
	
	/*
	 * 한글로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return 	boolean		- 형식에 맞을경우 true, 맞지 않을 경우 false
	 */
	public boolean isKor(String str) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		return result;
	}
	
	/*
	 * 영문과 숫자로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return 	boolean		- 형식에 맞을경우 true, 맞지 않을 경우 false
	 */
	
	public boolean isEngNum(String str) {
		boolean result = false;
		if(isValue(str)) {
			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
		}
		return result;
	}
	
	
	
	
	
}
