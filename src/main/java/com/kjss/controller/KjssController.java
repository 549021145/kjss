package com.kjss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kjss")
public class KjssController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
