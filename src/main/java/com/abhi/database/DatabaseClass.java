package com.abhi.database;

import java.util.HashMap;
import java.util.Map;


public class DatabaseClass {

	private static Map<String, String> linkDB = new HashMap<>();

	public static Map<String, String> getLinks() {
		return linkDB;
	}

}

