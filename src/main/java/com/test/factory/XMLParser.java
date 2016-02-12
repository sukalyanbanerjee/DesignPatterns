package com.test.factory;

import java.io.File;
import java.util.List;

public class XMLParser implements Parser {

	public XMLParser(File file) {
		System.out.println("Creating XML Parser");
	}
	
	@Override
	public List<Record> parse() {
		System.out.println("Returning list of records");
		return null;
	}

}
