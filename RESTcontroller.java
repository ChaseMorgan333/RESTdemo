package com.hcc.example.RESTdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTcontroller {

	@GetMapping("/greeting2")
	public Greeting greeting2(@RequestParam String name) {
		return new Greeting(name, true);
	}
	
	
//	@GetMapping("/greeting/{name}")
//	public String greeting(@PathVariable String name) {
//		return "hello " + name;
//	}
	
	
//	@GetMapping("/greeting")
//	public String greeting() {
//		return "hello";
//	}
	
	
//	@GetMapping
//	public String greeting() {
//		return "Hello Web";
//	}
}
