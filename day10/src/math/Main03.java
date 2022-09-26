package math;

import study.java.helper.Util;

public class Main03 {

	public static void main(String[] args) {
		
	/*
	 * Util Class 안에 정의 되어있는 random() 사용해서 
	 * 5자리 인증번호를 생성
	 * 	ex)11289, 259309, 11302,
	 * 
	 */
	String authNum = "";
	
	for(int i = 0; i<5; i++) {
		authNum += Util.getInstance().random(0, 9);
	}

	System.out.println("인증번호 : " + authNum);
	
	}

}
