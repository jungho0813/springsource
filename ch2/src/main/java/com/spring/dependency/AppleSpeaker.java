package com.spring.dependency;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("SonySpeaker �ν��Ͻ� ����");
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
