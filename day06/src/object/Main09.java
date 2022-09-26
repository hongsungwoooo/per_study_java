package object;
	
class Article{
	int seq;				// 글 번호
	String subject;			// 글 제목
	String writer;			// 작성자
	
	// seq, subject, writer 3개를 생성자 파라미터로 받아와서,
	// 전역변수에 각각 할당해주는 생성자 생성
	Article( int seq, String subject, String writer ){
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	// 메서드, void, seq, subject, writer 각각 출력하는 메서드 생성
	void read() {
		System.out.println("---- 출력! ----");
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
}	
		
public class Main09 {

	public static void main(String[] args) {
		//Article 객체 생성
		Article article = new Article(1,"The Old Man and the Sea","E.Hemingway");
		
		// 메서드 호출해서 전역변수 출력
		article.read();
		
	}
}
