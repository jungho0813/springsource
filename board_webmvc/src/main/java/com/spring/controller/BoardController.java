package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.BoardDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void listGet(Model model) {
		log.info("����Ʈ ������ ��û");
		
		List<BoardDTO> list = service.getList();
		
		model.addAttribute("list",list);
	}
	
	@GetMapping("/register")
	public void registerGet() {
		log.info("�۾��� �� ��û");
	}
	
	@PostMapping("/register")
	public String registerPost(BoardDTO dto) {
		log.info("�۾��� ��� ��û "+ dto);
		
		if(service.insert(dto)) {
			return "redirect:/board/list";
		}
		return "/board/register";
	}
	
	@GetMapping("/read")
	public void readGet(int bno) {
		log.info("���� ��ȸ "+bno);
	}
	
	
}
