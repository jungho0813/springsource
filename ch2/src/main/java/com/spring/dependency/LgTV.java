package com.spring.dependency;

public class LgTV implements TV{
	@Override
	public void PowerOn() {
		System.out.println("LGTV - ���� On");
	}
	@Override
	public void PowerOff() {
		System.out.println("LGTV - ���� Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV - ���� Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV - ���� Down");
	}
}
