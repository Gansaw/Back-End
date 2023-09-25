package edu.pnu.service;

import org.springframework.stereotype.Service;

@Service
public class TestService1 {
	
	public TestService1() {
		System.out.println("testservice1");
	}

	public String test() {
		return "Testservice1:test()";
	}

}
