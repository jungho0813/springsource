package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
//		LgTV lgTv = new LgTV();
//		lgTv.turnOn();
//		lgTv.soundUp();
//		lgTv.soundDown();
//		lgTv.turnOff();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		TV samsungTv = (TV) ctx.getBean("samsung");
		samsungTv.PowerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.PowerOff();
	}

}
