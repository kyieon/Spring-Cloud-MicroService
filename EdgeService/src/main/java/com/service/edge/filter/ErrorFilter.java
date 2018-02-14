package com.service.edge.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ErrorFilter extends ZuulFilter {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public String filterType() {
		return FilterType.ERROR.getsType();
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		log.info("Using Error Filter :: Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		return null;
	}
}