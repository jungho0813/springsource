package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.BookDTO;
import com.spring.service.BookService;
import com.spring.service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//		
//		//Service ȣ��
		BookService service = (BookService) ctx.getBean("bookService");
		
//		//���� �߰�
//		BookDTO insertDto = new BookDTO(1100, "java", "��", 20000, "java");
//		if(service.insertBook(insertDto)) {
//			System.out.println("�Է¼���");
//		}
		
//		BookDTO updateDto = new BookDTO();
//		updateDto.setCode(1006);
//		updateDto.setPrice(30000);
//		if(service.updateBook(updateDto)) {
//			System.out.println("��������");
//		}
		

//		if(service.deleteBook(1006)) {
//			System.out.println("��������");
//		}
		
		
		//��ü ���� ��� ��������
//		BookService service = new BookServiceImpl(new BookDAO());
		List<BookDTO> list = service.getBookList();
//		
//		for (BookDTO bookDTO : list) {
//			System.out.println(bookDTO);
//		}
		
		
		
	}
}
