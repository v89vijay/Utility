package com.java.kafka.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer-app")
public class ConsumerController {
	
	@GetMapping("/consume")
	public ResponseEntity<String> consumeMessage() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
