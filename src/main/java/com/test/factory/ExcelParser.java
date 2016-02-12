package com.test.factory;

import java.io.File;
import java.util.List;

public class ExcelParser implements Parser {

	public ExcelParser(File file) {
		System.out.println("Creating Excel Parser...");
	}
	
	@Override
	public List<Record> parse() {
		System.out.println("Returning list of records...ß");
		return null;
	}

}
