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
//		//Service 호출
		BookService service = (BookService) ctx.getBean("bookService");
		
//		//도서 추가
//		BookDTO insertDto = new BookDTO(1100, "java", "김", 20000, "java");
//		if(service.insertBook(insertDto)) {
//			System.out.println("입력성공");
//		}
		
//		BookDTO updateDto = new BookDTO();
//		updateDto.setCode(1006);
//		updateDto.setPrice(30000);
//		if(service.updateBook(updateDto)) {
//			System.out.println("수정성공");
//		}
		

//		if(service.deleteBook(1006)) {
//			System.out.println("삭제성공");
//		}
		
		
		//전체 도서 목록 가져오기
//		BookService service = new BookServiceImpl(new BookDAO());
		List<BookDTO> list = service.getBookList();
//		
//		for (BookDTO bookDTO : list) {
//			System.out.println(bookDTO);
//		}
		
		
		
	}
}
