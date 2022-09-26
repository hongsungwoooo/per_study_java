package staticobject;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫번째 게시물", "2022-08-18");
		Article a2 = new Article(2, "두번째 게시물", "2022-08-18");
		Article a3 = new Article(3, "세번째 게시물", "2022-08-19");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println("-------------------------");
		
		Article.setCategory("공지사항");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());	
		
		
	}

}
