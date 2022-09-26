package Cafe;
import java.util.*;

public class Main01 {

	public static void main(String[] args) {
//		주문 갯수를 저장할 count
		int count = 0;
//		주문한 메뉴를 저장할 메뉴리스트
		String orderList[]=new String[5];
//		총 금액 저장할 변수
		int total = 0;
		
		
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("--카페 주문 프로그램--");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력 :");
//			정수형으로 입력
			int num= sc.nextInt();
			if(num==1) {
//				초기값 설정
				String menuName="";
				int menuPrice=0;
				System.out.println(" 1. 아메리카노 \t3800원");
				System.out.println(" 2. 에스프레소 \t2400원");
				System.out.println(" 3. 카페라떼 \t4200원");
				System.out.println(" 4. 밀크티 \t5100원");
				int menuNum=sc.nextInt();
			//주문
			if(menuNum==1) {
					menuName	=	"아메리카노";
					menuPrice	=	3800;
							
				}
				else if(menuNum==2) {
					menuName	=	"에스프레소";
					menuPrice	=	2400;
				}
				else if(menuNum==3) {
					menuName	=	"카페라떼";
					menuPrice	=	4200;
				}
				else if(menuNum==4) {
					menuName	=	"밀크티";
					menuPrice	=	5100;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
//					잘못입력시 처음으로 돌아가라
				}
				total+=menuPrice;
//				총금액 누적
				orderList[count]=menuName;
				count++;
//				주문한 메뉴 리스트 추가
				System.out.println("주문한 메뉴는 "+ menuName + " 입니다");
				System.out.println("가격은 "+ menuPrice + " 입니다");
			}
			//취소
			else if(num==2) {
				System.out.println("-----주문한 메뉴 리스트-----");
				for(int i=0; i<count; i++) {
					System.out.println(i+1+"."+orderList[i]);
//					취소할 메뉴번호를 물어본다
				}
				System.out.println("취소할 메뉴번호");
				int cancelNum=sc.nextInt();
//				취소할 메뉴를 입력받는다.
				if(1<=cancelNum && cancelNum<=count) {
					String delMenu=orderList[cancelNum-1];
					System.out.println(delMenu+"해당 주문내역을 삭제합니다.");
					for(int i=cancelNum-1; i<count; i++) {
						orderList[i]=orderList[i+1];
					}
//					금액차감
					if(delMenu.equals("아메리카노")){
						total-=3800;
					}
					else if(delMenu.equals("에스프레소")) {
						total-=2400;
					}
					else if(delMenu.equals("카페라떼")) {
						total-=4200;
					}
					else if(delMenu.equals("밀크티")) {
						total-=5100;
					}
//					주문한 갯수 감소
					count--;
				}
			}else if(num==3) {
				System.out.println("결제할 금액 : " + total+"원");
				System.out.println("지불할 금액 :");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("잔돈이 부족합니다.");
					continue;
				}else {
					System.out.println("잔돈은 "+(money-total)+"원 입니다.");
					total=0;
					for(int i=0; i<5; i++) {
						orderList[i]="";
					}
					count=0;
				}
				
				
			}else if(num==4) {
				System.out.println("주문 종료");
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다");
			}
			
		}
		
		
		
		
		
		
	}

}
