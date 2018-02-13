package com.service.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	private AtomicInteger i = new AtomicInteger();
	
	//Call v1
	@GetMapping("/hello")
    public String getData() {
		return "API Service V1, " + i.incrementAndGet();
    }
}
