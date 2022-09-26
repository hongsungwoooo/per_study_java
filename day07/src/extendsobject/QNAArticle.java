package extendsobject;

public class QNAArticle extends Article {

	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "QNAArticle[ 글 번호 = " + getNum()
				+ ", 글 제목 = " + getTitle()
				+ ", 답변 = " + answer + "]";
	}
		
}
