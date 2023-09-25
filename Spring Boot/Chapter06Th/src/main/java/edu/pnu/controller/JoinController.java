package edu.pnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("member")
@Controller
public class JoinController {
	
	@GetMapping("/join")
	public void joinView() {
		
	}
	
//	@PostMapping("/join")
//	public String join()

}
