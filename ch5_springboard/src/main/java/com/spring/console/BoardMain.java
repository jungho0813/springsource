package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.BoardDTO;
import com.spring.service.BoardService;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		BoardService service = (BoardService) ctx.getBean("board");		
		
		// �Խñ� �ۼ�
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle("������");
//		dto.setContent("������ �Խ���");
//		dto.setWriter("ȫ");
//		boolean result = service.insertBoard(dto);
//		System.out.println(result ? "�Է¼���" : "�Է½���");
		
//		BoardDTO dto = new BoardDTO();
//		dto.setBno(1);
//		dto.setTitle("������ ����");
//		dto.setContent("������ ������ ����");
//		boolean result = service.updateBoard(dto);
//		System.out.println(result ? "�Է¼���" : "�Է½���");
		
//		System.out.println(service.deleteBoard(2)?"��������":"��������");
		
		System.out.println(service.getRow(1));
		List<BoardDTO> list = service.getRows();
		for (BoardDTO boardDTO : list) {
			System.out.println(boardDTO);
		}
	}

}
