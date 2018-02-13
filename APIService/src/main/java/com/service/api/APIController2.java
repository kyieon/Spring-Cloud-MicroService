package com.service.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoker/v2/api.do")
public class APIController2 {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	private AtomicInteger i = new AtomicInteger();
	
	@GetMapping("/hello")
    public String getData() {
		return "API Service V2, " + i.incrementAndGet();
    }
}
