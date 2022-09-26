package hiding;

public class Main04 {

	public static void main(String[] args) {

		// 객체 생성
		Article article = new Article(1, "자바수업", "자바기초", "dooly", 200, "20220816");
		Article article01 = new Article(2, "자바수업2", "자바심화", "ddochy", 300, "20220817");
		
		//출력
		System.out.println("글 번호	: " + article.getSeq());
		System.out.println("글 제목	: " + article.getSubject());
		System.out.println("글 내용	: " + article.getContent());
		System.out.println("작성자	: " + article.getWriter());
		System.out.println("조회수	: " + article.getHit());
		System.out.println("작성일시	: " + article.getRegDate());
	
		System.out.println("-------------------------------");
		
		System.out.println("글 번호	: " + article01.getSeq());
		System.out.println("글 제목	: " + article01.getSubject());
		System.out.println("글 내용	: " + article01.getContent());
		System.out.println("작성자 	: " + article01.getWriter());
		System.out.println("조회수  	: " + article01.getHit());
		System.out.println("작성일시 	: " + article01.getRegDate());
		
		
		
	}

}
