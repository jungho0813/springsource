package com.spring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/security")
public class SecurityController {
	
	@GetMapping("/login")
	public void loginGet() {
		log.info("로그인 폼 요청");	
	}
	
	@GetMapping("/userpage")
	public void userPage() {
		log.info("유저페이지 요청");	
	}
	
	@GetMapping("/adminpage")
	public void adminPage() {
		log.info("어드민페이지 요청");	
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("error","아이디와 비밀번호를 확인해주세요");
		return "/security/login";
	}
	
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "/security/denied";
	}
	
	@GetMapping("/auth")
	@ResponseBody
	public Authentication auth() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
	
}
