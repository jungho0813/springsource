package com.spring.basic;

public class TvMain {

	public static void main(String[] args) {
//		LgTV lgTv = new LgTV();
//		lgTv.turnOn();
//		lgTv.soundUp();
//		lgTv.soundDown();
//		lgTv.turnOff();
		
		TV samsungTv = new SamsungTV();
		samsungTv.PowerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.PowerOff();
	}

}
