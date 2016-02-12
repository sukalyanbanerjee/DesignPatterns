package com.test.factory;

import java.io.File;
import java.util.List;

public class TextParser implements Parser {
	public TextParser(File file) {
		System.out.println("Creating TEXT parser.....");
	}
	
	public List<Record> parse() {
		System.out.println("Returning list of record...");
		return null;
	}
}
