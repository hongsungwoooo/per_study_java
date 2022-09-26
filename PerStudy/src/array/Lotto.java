package array;

import java.util.*;
// scanner 클래스와 random 클래스를 사용하기 위해 util import

public class Lotto {

	public static void main(String[] args) {
		
//		번호를 입력받을 스케너
		Scanner sc = new Scanner(System.in);
// 		랜덤 숫자 값 가져오기
		Random random = new Random();
		
		int lottoAr[]=new int[6]; 	//6개의 로또번호 저장할 배열
		int userAr[]=new int[6];	//사용자에게 6개의 숫자를 입력받아 저장할 배열
		int bonus, bonusUser;		//보너스 숫자를 저장할변수, 사용자에게 보너스숫자를 입력받아 저장할 변수
		int count=0;				//동일한 숫자가 몇 개인지 카운트할 변수
		
//		6개의 랜덤 숫자와 보너스 점수를 로또 배열에 저장
		
		//로또 배열에 6개의 랜덤값을 저장
		for(int i=0; i<6; i++) {
			lottoAr[i]=random.nextInt(45)+1; //0~44 -> 1~ 45
		}
		
		//bonus = random
		bonus=random.nextInt(45)+1;
		
	
		
		//사용자에게 6개의 값을 입력
		System.out.println("숫자 6개 ( 1 ~ 45 ) 입력 : ");
		for(int i =0; i<6; i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.println("보너스 값 ( 1 ~ 45 )  입력 : ");
		bonusUser=sc.nextInt();
		System.out.println("입력 Lotto 번호 : "+ Arrays.toString(userAr) + ", 입력 bonus 번호 : "+ bonusUser);
		System.out.println("");
		System.out.println("당첨 Lotto 번호 : "+ Arrays.toString(lottoAr) + ", 당첨 bonus 번호 : "+ bonus);
		System.out.println("");
		
		//로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇 개 있는지 카운팅
		for(int j =0; j<6; j++) {
			for(int i=0; i<6; i++) {
			if(lottoAr[j]==userAr[i]) {
				count++;
			}
			}
		}
		
		System.out.println("총 맞춘 갯수 :" + count);
		//count의 갯수에 따라서 등수 정하기
		if(count==6) {
			System.out.println(" 1등! 축하드립니다! ");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println(" 2등! 축하드립니다!");
			}
			else {
				System.out.println(" 3등! 축하드립니다!");
			}
		}
		
		else if(count==4) {
			System.out.println(" 4등! 축하드립니다!");
		}
		else if(count==3) {
			System.out.println("5등! 축하드립니다!");
		}
		else {
			System.out.println("꽝!");
		}
		
		
		
	}

}
