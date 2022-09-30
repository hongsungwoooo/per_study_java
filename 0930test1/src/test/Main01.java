package test;

public class Main01 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		// 9.isPowerOn false인 상태로 channel, volume 수정 후, toString()으로 확인
		// (전반적인 처리 논리 구조에 예기치 못한 영향을 끼치지 않도록 공통 모듈 인터페이스의 인덱스 번호나 기능 코드를 설계할 수 있다.10)
		t.setPowerOn(false);
		t.setVolume(20);
		System.out.println("현재 볼륨 : " + t.getVolume());
		System.out.println(t.toString());
		
		// 10.isPowerOn true인 상태로 channel, volume 수정 후, toString()으로 확인
		//(	소프트웨어 아키텍처에서 정의한 타 시스템 연동 리스트 및 연동 방안을 참조하여ㆍ타 시스템 연동 상세 설계의 가이드라인을 작성할 수 있다.10)
		t.setPowerOn(true);
		t.setChannel(30);
		t.setVolume(40);
		System.out.println("현재 채널 :" + t.getChannel() + " 현재 볼륨 : " + t.getVolume());
		System.out.println(t.toString());
		
		// 11.isPowerOn true인 상태로 channel만 수정 후, toString()으로 확인
		// (소프트웨어 아키텍처에 따라 선정된 개발 및 운영 환경에 사용될 기술영역별 미들웨어솔루션에 대하여 명세를 작성할 수 있다.10)
		t.setPowerOn(true);
		t.setChannel(50);
		System.out.println("현재 채널 :" + t.getChannel() + " 현재 볼륨 : " + t.getVolume());
		System.out.println(t.toString());
		
		// 12.gotoPrevChannel()(이전 채널로 되돌리기) 호출 후, toString()으로 확인
		// (소프트웨어 아키텍처에 따라 선정된 개발 및 운영 환경에 사용될 기술영역별 미들웨어솔루션에 대하여 명세를 작성할 수 있다.10)
		t.gotoPrevChannel();
		System.out.println("현재 채널 :" + t.getChannel() + " 현재 볼륨 : " + t.getVolume());
		System.out.println(t.toString());
	}
}
