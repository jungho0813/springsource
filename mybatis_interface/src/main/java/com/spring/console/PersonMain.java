package com.spring.console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.PersonDTO;
import com.spring.service.PersonService;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		PersonService service = (PersonService) ctx.getBean("person");
		
		//����
//		PersonDTO inserPerson = new PersonDTO("h15", "ȫ");
//		System.out.println(service.insertPerson(inserPerson)?"����":"����");
		
//		service.deletePerson("h15");
//		PersonDTO updatePserson = new PersonDTO("l22","��");
//		service.updatePerson(updatePserson);
//		System.out.println(service.getRow("l22"));
//		System.out.println(service.getRows());
		
	}

}
