package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.LoginDTO;
import com.spring.domain.RegisterDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
	
//	@RequestMapping(value="/login", method = RequestMethod.GET)
	@GetMapping("/login")
	public void loginGet(HttpServletRequest req) {
		log.info("login...");
		log.info("method "+req.getMethod());
//		return "login";
	}
	
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	@PostMapping("login")
//	public void loginPost(HttpServletRequest req) {
//		log.info("login post...");
//		log.info("method "+req.getMethod());
//	}
	
//	@PostMapping("/login")
//	public void loginPost(String id, String password) {
//		log.info("login post...");
//		System.out.println("id "+id);
//		System.out.println("password "+password);
//	}
	
	@PostMapping("/login")
	public void loginPost(LoginDTO dto) {
		log.info("login post...");
		System.out.println("id "+dto.getId());
		System.out.println("password "+dto.getPassword());
	}
	
//	@RequestMapping("/register")
	@GetMapping("/register")
	public void registerGet() {
		log.info("register...");
	}
	
	
	@PostMapping("/register")
	public String registerPost(RegisterDTO dto) {
		log.info("회원가입 요청");
		log.info(dto.toString());
		
		// redirect : DispatcherServlet 동작
		// == response.sendRedirect()
		return "redirect:/member/login";
	}
}
