package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		System.out.println("=== �����̳� ���� �� ===");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("=== �����̳� ���� �� ===");
		MessageBean msg = (MessageBean) ctx.getBean("msg");
		msg.sayHello("ȫ�浿");

	}

}
