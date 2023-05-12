package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/sample")
public class BasicController {
	
//	@RequestMapping("/basic")
	@GetMapping("/basic")
	public void basic() {
		log.info("basic......ฟไรป");
	}
}
