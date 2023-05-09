package com.spring.dependency;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;  // has-a(����) ����
	
	//�Ű������� ���� �ʴ� ������ : default ������
	public SamsungTV() {
		System.out.println("SamsungTV �ν��Ͻ� ���� - default ������");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker;
		System.out.println("SamsungTV �ν��Ͻ� ���� - ���� ������");
	}
	
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	
	@Override
	public void PowerOn() {
		System.out.println("SamsungTV - �Ŀ� On");
	}
	@Override
	public void PowerOff() {
		System.out.println("SamsungTV - �Ŀ� Off");
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
