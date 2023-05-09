package com.spring.dependency;

public class LgTV implements TV{
	@Override
	public void PowerOn() {
		System.out.println("LGTV - Àü¿ø On");
	}
	@Override
	public void PowerOff() {
		System.out.println("LGTV - Àü¿ø Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV - º¼·ý Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV - º¼·ý Down");
	}
}
