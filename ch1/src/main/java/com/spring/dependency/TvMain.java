package com.spring.dependency;

public class TvMain {


	public static void main(String[] args) {
		
//		SonySpeaker speaker = new SonySpeaker();
//		TV tv = new SamsungTV(speaker);
		
//		TV tv = new SamsungTV(new SonySpeaker());
		
		SamsungTV tv = new SamsungTV();
		
		tv.setSpeaker(new SonySpeaker());
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		

		
	}

}
