package Overload;

public class Article {

	private int seq;
	private String subject;
	private String writer;
	
	//-----생성자 객체-----
	public Article(int seq, String subject, String writer) {  //제목을 입력하지않을때는 "제목없음" 글쓴이 입력하지않을경우 "익명"
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
		
	}
	
	public Article ( int seq) {
	//	this.seq = seq;
	//	this.subject = "제목없음";
	//	this.writer = "익명";
		this(seq, "제목없음", "익명"); 	//this를 메서드처럼 사용하여 호출
	}

	public Article ( int seq, String subject) {
	//	this.seq = seq;
	//	this.subject = subject;
	//	this.writer = "익명";
		this(seq, subject, "익명");
	}
	//--------------
	
	@Override
	public String toString() {
		return "Article [ seq = " + seq + ", "
						+ "subject = " + subject 
						+ ", writer = " + writer + " ]";
	}
	
	
	
	
	
	
	
}
