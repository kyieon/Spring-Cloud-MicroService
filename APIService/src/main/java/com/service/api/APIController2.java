package com.service.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoker/v2/api.do")
public class APIController2 {

	@Autowired 
	private APIService apiService;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/hello")
    public String getData() throws InterruptedException {
		return apiService.call();
    }
}
