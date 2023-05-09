package com.spring.dependency;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("SonySpeaker 인스턴스 생성");
	}
	
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker Volume Down");
	
	}

}
