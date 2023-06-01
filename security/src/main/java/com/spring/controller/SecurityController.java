package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/security")
public class SecurityController {
	
	@GetMapping("/login")
	public void loginGet() {
		log.info("�α��� �� ��û");	
	}
	
	@GetMapping("/userpage")
	public void userPage() {
		log.info("���������� ��û");	
	}
	
	@GetMapping("/adminpage")
	public void adminPage() {
		log.info("���������� ��û");	
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("error","���̵�� ��й�ȣ�� Ȯ�����ּ���");
		return "/security/login";
	}
}
