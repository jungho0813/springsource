package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/list")
	public void listGet(Model model,Criteria cri) {
		log.info("����Ʈ ������ ��û");
		
		//����� ��û�� ��ȣ�� �´� �Խù� ��� ��û
		List<BoardDTO> list = service.getList(cri);
		//��ü �Խù� ����
		int total = service.getTotalCnt();
		
		model.addAttribute("list",list);
		model.addAttribute("pageDTO",new PageDTO(cri, total));
	}
	
	@GetMapping("/register")
	public void registerGet() {
		log.info("�۾��� �� ��û");
	}
	
	@PostMapping("/register")
	public String registerPost(BoardDTO dto,RedirectAttributes rttr) {
		log.info("�۾��� ��� ��û "+ dto);
		
		if(service.insert(dto)) {
			log.info("�� ��ȣ : "+dto.getBno());
			
			rttr.addFlashAttribute("result",dto.getBno());
			return "redirect:/board/list";
		}
		return "/board/register";
	}
	
	@GetMapping({"/read","/modify"})
	public void readGet(int bno,Model model) {
		log.info("���� ��ȸ "+bno);
		
		BoardDTO dto = service.getRow(bno);
		
		model.addAttribute("dto",dto);
	}
	
	@PostMapping("/modify")
	public String modifyPost(BoardDTO dto,RedirectAttributes rttr) {
		//���� �� ����Ʈ
		service.update(dto);
		rttr.addFlashAttribute("result","������ �Ϸ�Ǿ����ϴ�.");
		return "redirect:/board/list";	
	}
	
	@GetMapping("/remove")
	public String removeGet(int bno,RedirectAttributes rttr) {
		service.remove(bno);
		
		rttr.addFlashAttribute("result","������ �Ϸ�Ǿ����ϴ�.");
		return "redirect:/board/list";
	}
	
}
