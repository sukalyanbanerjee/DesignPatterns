package com.test.factory;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser {

	public CSVParser(File file) {
		System.out.println("Creating CSV Parser....");
	}
	
	public List<Record> parse() {
		System.out.println("Returning list of records....");
		return null;
	}
}
