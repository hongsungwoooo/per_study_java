package string;
/*
 * 	이스케이프문자(특수문자, 줄바꿈 탭띄어쓰기 출력)
 * --------------------------------
 * JAVA -> "JAVA" 쌍따옴표가 붙은체로 출력하고싶을때!
 * 프로그램의 문자열 안에 포함 될 수 있는 특수문자.
 * ex)문자열 안에 쌍따옴표를 표현하고자 할때 사용한다.
 * 
 */
public class Main05 {

	public static void main(String[] args) {
		String src = "JAVA";
		
		//문자열 안에 쌍따옴표 포함 (역슬래시 다음에있는 문자 출력)
		System.out.println("\"" + src + "\"" );
		System.out.println("----------------------");
		
		//문자열 안에 홀따옴표 포함시키기	
		System.out.println("\'"+src+"");
		System.out.println("----------------------");
		
		//줄바꿈 "\n"
		System.out.println("\n"+src);
		
		// 탭키에 사용되는 문자 "\t"
		System.out.println("\t" + src);
	}
}
