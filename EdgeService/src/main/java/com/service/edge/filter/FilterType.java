package com.service.edge.filter;

enum FilterType {
	PRE("pre"),
	POST("post"),
	ROUTE("route"),
	ERROR("error"),
	;
	
	private String sType;

	private FilterType(String sType) {
		this.sType = sType;
	}
	
	public String getsType() {
		return sType;
	}
}
