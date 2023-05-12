package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
////		return "login";
//	}
	
	@PostMapping("login")
	public void loginPost(String id, String password) {
		log.info("login post...");
		System.out.println("id "+id);
		System.out.println("password "+password);
		
//		return "login";
	}
	
//	@RequestMapping("/register")
	@GetMapping("/register")
	public void registerGet() {
		log.info("register...");
//		return "register";
	}
}
