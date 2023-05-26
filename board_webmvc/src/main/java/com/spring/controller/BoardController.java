package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	// ��ü ����Ʈ �����ֱ� ��Ʈ�ѷ� �ۼ� : list.jsp �����ֱ�
	
	@GetMapping("/list")
	public void listGet(Model model,@ModelAttribute("cri") Criteria cri) {
		log.info("��ü ����Ʈ ��û ");
		log.info("type "+ Arrays.toString(cri.getTypeArr()));
		
		//����� ��û�� ��ȣ�� �´� �Խù� ��� ��û
		List<BoardDTO> list  = service.getList(cri);
		//��ü �Խù� ����
		int total = service.getTotalCnt(cri);
		
		model.addAttribute("list", list);	
		model.addAttribute("pageDTO", new PageDTO(cri, total));
	}
	
	// register.jsp �����ֱ�
	@GetMapping("/register")
	public void registerGet() {
		log.info("�۾��� �� ��û");
	}
	
	@PostMapping("/register")
	public String registerPost(BoardDTO dto,RedirectAttributes rttr,Criteria cri) {
		log.info("�۾��� ��� ��û "+dto);
		
		if(service.insert(dto)) {
			
			log.info("�� ��ȣ : "+dto.getBno());
			
			rttr.addFlashAttribute("result", dto.getBno());
			//������ ������ ���� �ּ��ٿ� ���� ������
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("amount", cri.getAmount());
			return "redirect:/board/list";
		}
		return "/board/register"; 
	}
	
	//   http://localhost:8080/board/read?page=5&amount=10&bno=1
	//   http://localhost:8080/board/modify?page=5&amount=10&bno=1
	@GetMapping({"/read","/modify"})
	public void readGet(int bno,Model model,@ModelAttribute("cri") Criteria cri){
		log.info("���� ��ȸ "+bno);
		
		//bno �� �´� ���� ��������
		BoardDTO dto = service.getRow(bno);
		model.addAttribute("dto", dto);		
	}
	
	@PostMapping("/modify")
	public String modifyPost(BoardDTO dto,RedirectAttributes rttr,Criteria cri) {
		log.info("���� ���� "+cri);
		//���� �� ����Ʈ
		service.update(dto);
		
		rttr.addFlashAttribute("result", "������ �Ϸ�Ǿ����ϴ�.");
		
		//������ ������ ���� �ּ��ٿ� ���� ������
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("amount", cri.getAmount());
		//�˻� ���� �ּ��ٿ� ������
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/board/list";		
	}
	
	// /board/remove?bno=21
	
	@GetMapping("/remove")
	public String removeGet(int bno,RedirectAttributes rttr,Criteria cri) {
		//���� �� ����Ʈ
		service.delete(bno);
		
		rttr.addFlashAttribute("result", "������ �Ϸ�Ǿ����ϴ�.");
		
		//������ ������ ���� �ּ��ٿ� ���� ������
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("amount", cri.getAmount());
		//�˻� ���� �ּ��ٿ� ������
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/list";		
	}
	
}

