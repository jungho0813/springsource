package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.BookDTO;
import com.spring.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/book")
@Slf4j
public class BookController {
	
	@Autowired
	private BookService service;	
	
	
	//http://localhost:8080/book/insert + GET
	//  /product/insert.jsp �����ֱ�
//	@GetMapping("/insert")
//	public String insertForm() {
//		log.info("���� ���� �߰� �� ��û");		
//		return "/product/insert";
//	}
//	
//	// http://localhost:8080/book/insert + POST 	
//	@PostMapping("/insert")
//	public String insertPost(BookDTO dto) {
//		log.info("���� ���� �߰�");
//		
//		//�Է°� �������� - HttpServletRequest, ����, ~~DTO
//		//���� �۾�
//		try {
//			boolean insertFlag = service.insert(dto);
//			if(insertFlag) {
//				//�Է� ���� �� ��� �����ֱ�
//				return "redirect:/book/list";
//			}else {
//				//�Է� ���� �� insert.jsp �����ֱ�
//				return "/product/insert";
//			}			
//		} catch (Exception e) {
//			System.out.println("����");
//			return "/product/insert";
//		}		
//	}
//	
//	
//	// http://localhost:8080/book/list + GET => list.jsp �����ֱ�
//	@GetMapping("/list")
//	public String listForm(Model model) {
//		log.info("���� ���� ��� ��û");
//		
//		//����ڰ� �ۼ��� �� ��������
//		//service �۾�
//		List<BookDTO> list = service.getList();		
//		//list �� ��� ������ list.jsp�� �����ְ� �ʹٸ�?
//		model.addAttribute("list", list); //== request.setAttribute()		
//		return "/product/list";
//	}
//	
//	// http://localhost:8080/book/read?code=1001 + GET
//	@GetMapping("/read")
//	public String readGet(int code, Model model) {
//		log.info("read ��û "+code);
//		
//		BookDTO dto = service.get(code);
//		model.addAttribute("dto", dto);
//		
//		return "/product/read";
//	}
	
	
	//http://localhost:8080/book/insert + GET
	//  /book/insert.jsp �����ֱ�
	
	@GetMapping("/insert")
	public void insertForm() {
		log.info("���� ���� �߰� �� ��û");			
	}
	
	// http://localhost:8080/book/insert + POST 	
	@PostMapping("/insert")
	public String insertPost(BookDTO dto) {
		log.info("���� ���� �߰�");
		
		//�Է°� �������� - HttpServletRequest, ����, ~~DTO
		//���� �۾�
		try {
			boolean insertFlag = service.insert(dto);
			if(insertFlag) {
				//�Է� ���� �� ��� �����ֱ�
				return "redirect:/book/list";
			}else {
				//�Է� ���� �� insert.jsp �����ֱ�
				return "/book/insert";
			}			
		} catch (Exception e) {
			System.out.println("����");
			return "/book/insert";
		}		
	}
	
	
	// http://localhost:8080/book/list + GET => book/list.jsp �����ֱ�
	@GetMapping("/list")
	public void listForm(Model model) {
		log.info("���� ���� ��� ��û");
		
		//����ڰ� �ۼ��� �� ��������
		//service �۾�
		List<BookDTO> list = service.getList();		
		//list �� ��� ������ list.jsp�� �����ְ� �ʹٸ�?
		model.addAttribute("list", list); //== request.setAttribute()		
	}
	
	// http://localhost:8080/book/read?code=1001 + GET => book/read.jsp
	// http://localhost:8080/book/modify?code=1006 => book/update.jsp
	@GetMapping({"/read","modify"})
	public void readGet(int code, Model model) {
		log.info("read ��û "+code);
		
		BookDTO dto = service.get(code);
		model.addAttribute("dto", dto);	
	}
	
	@PostMapping("/modify")
	public void updatePost(BookDTO dto) {
		log.info("���� ���� ����" +dto);
	}

}









