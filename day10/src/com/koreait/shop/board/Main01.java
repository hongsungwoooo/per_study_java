package com.koreait.shop.board;

import staticobject.Article;

//다른패키지의 내용 끌어쓰기

public class Main01 {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 사용하고자 할 경우
		// 패키지 이름을 포함한 FullName으로 사용해야 한다.
		
//		staticobject.Article article
//		= new staticobject.Article(1, "테스트글", "2022-08-19");
		//이러한 번거로움을 피하고자 클래스 정의 전에 import 구문을 사용하여 
		// 특정 클래스의 이름이 어떤 패키지에 소속되어 있는지를 명시할 수 있다.
		
		Article a1 = new Article(2, "테스트글", "2022-08-19");
		System.out.println(a1);
		
		
	}

}
