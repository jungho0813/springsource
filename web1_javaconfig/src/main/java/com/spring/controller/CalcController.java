package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.domain.addDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CalcController {
	
	@GetMapping("/add")
	public void addForm() {
		log.info("add 요청");
	}
	
	@PostMapping("/add")
	public String addPost(addDTO dto) {
		log.info("add post 요청");
		log.info("num1 "+ dto.getNum1());
		log.info("num2 "+dto.getNum2());
		log.info("result "+(dto.getNum1()+dto.getNum2()));
		
		return "result";
	}
}
