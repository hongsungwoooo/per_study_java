package file;
//강의 다시볼것(수정필요)
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		
		/*
		 *  문자열을 파일로 저장
		 *  -> 문자열을 파일로 저장하기 위해서는 byte배열로 변환해야 한다.
		 *  -> 문자열을 byte배열로 변환하기 위해서는 getBytes() 메서드를 사용하는데,
		 *  이 때 변환과정에서 사용할 인코딩 형식을 지정해 주어야 한다.
		 */
		
		// 저장할 파일의 경로
		String path = "text.txt";
		
		// 파일에 저장할 내용
		String write_string = "가나다라마바사abcdefg";
		
		// 특정 인코딩 방식 적용
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 알수없는 인코딩 정보 >>" + path);
			e.printStackTrace();
		}
		
		// 파일 저장 절차 시작
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
		OutputStream out = null;
		try {
			out = new FileOutputStream(path);
			// 파일 쓰기
			out.write(buffer);
			System.out.println("[INFO] 파일 저장 성공 >> " + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >>" + path);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일 저장 실패 >>" + path);
		} finally {
			//저장의 성공여부에 상관없이 스트림은 무조건 닫아야 한다.
			try {
				out.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
