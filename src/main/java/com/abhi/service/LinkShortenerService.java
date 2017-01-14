package com.abhi.service;

import java.util.Map;
import java.util.Random;

import com.abhi.database.DatabaseClass;
import com.abhi.pojo.LinkShortner;

public class LinkShortenerService {
	LinkShortner link = new LinkShortner();
	private Map<String, String> links = DatabaseClass.getLinks();

	public String addingAndConvertingUrl(LinkShortner link) {
		link.setUrl(link.getUrl());
		
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		
		links.put(output, link.getUrl());
		return output;
	}

	
	public String returnActualUrl(String url){	
		return links.get(url);
	}

}

