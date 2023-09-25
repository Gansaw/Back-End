package edu.pnu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {
	
	public HomeController() {
		System.out.println("Controller가 생성되었습니다.");		
		log.error("Controller error가 생성되었습니다.");
		log.warn("Controller warn이 생성되었습니다.");
		log.info("Controller info가 생성되었습니다.");
		log.debug("Controller debug가 생성되었습니다.");
		log.trace("Controller trace가 생성되었습니다.");
	}	
	
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}

}
