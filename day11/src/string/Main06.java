package string;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있다.
		 * 이 파일의 경로를 가지고 다음의 형태로 출력
		 * splite()사용금지
		 * ----------------------------------
		 * 파일이름 	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel
		 */
		
//	String file = "D:/photo/2022/travel/food.jpg";
//	int s = file.indexOf("/");
//	String[]fileData = file.split("/");
//	for(int k = 1; k<fileData.length; k++) {
//		System.out.printf(fileData[k]);
//	}												모르겠음..
		
		// 강사님 답안   (lastindexOf
		String data = "D:/photo/2022/travel/food.jpg";
	
		// 파일이름
		String name = data.substring(data.lastIndexOf("/")+1, data.lastIndexOf("."));
		System.out.println("파일이름 : "+ name);
		
		// 확장자 추출
		String ext = data.substring(data.lastIndexOf(".") + 1);
		System.out.println("확장자 : " + ext);
		
		// 소스파일 폴더이름 추출
		System.out.println("폴더명 : " + data.substring(0, data.lastIndexOf("/")));
		
		
		
		
		
		
		
		
	}

}
