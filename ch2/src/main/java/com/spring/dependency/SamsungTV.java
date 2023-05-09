package com.spring.dependency;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;  // has-a(포함) 관계
	
	//매개변수를 받지 않는 생성자 : default 생성자
	public SamsungTV() {
		System.out.println("SamsungTV 인스턴스 생성 - default 생성자");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker;
		System.out.println("SamsungTV 인스턴스 생성 - 인자 생성자");
	}
	
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	
	@Override
	public void PowerOn() {
		System.out.println("SamsungTV - 파워 On");
	}
	@Override
	public void PowerOff() {
		System.out.println("SamsungTV - 파워 Off");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
