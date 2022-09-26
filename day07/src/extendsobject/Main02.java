package extendsobject;

public class Main02 {

	public static void main(String[] args) {

		FileArticle fart = new FileArticle();
		fart.setNum(1);
		fart.setTitle("첫 번째 자료입니다.");
		fart.setFileName("java.ppt");
			
		System.out.println(fart.getNum());
		System.out.println(fart.getTitle());
		System.out.println(fart.getFileName()); //toString이 없었을 경우
		
		System.out.println("-------------");
		System.out.print( fart.toString());
		System.out.println();
		System.out.println("-------------");
		
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);	
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		System.out.println(qna.toString());
		
		
	}

}
