package com.abhi.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LinkShortner {

	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
