package com.service.api;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class APIService {

	@Autowired
	private Environment environment;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	@HystrixCommand(fallbackMethod="error")
	public String call() throws InterruptedException {
		Thread.sleep(5 * 1000L);
//		Thread.sleep(15 * 1000L);
		
		return "API Service - [" + environment.getProperty("server.port") + "] is Call :: OK ::" + i.incrementAndGet();
	}
	
	public String error() {
		return "API Service - [" + environment.getProperty("server.port") + "] is Call :: NOK ::" + j.incrementAndGet();
	}
}
