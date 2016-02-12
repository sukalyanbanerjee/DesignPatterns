package com.test.factory;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {

	public abstract Parser createParser(File file);
	
	public void processBatch(String fileName) {
		File file = openFile(fileName);
		Parser parser = createParser(file);
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}

	private void closeFile(File file) {
		System.out.println("Close File.....");
	}

	private void writeSummary() {
		System.out.println("Writing Summary.....");
	}

	private void processRecords(List<Record> records) {
		System.out.println("Processing Records....");
	}

	private File openFile(String fileName) {
		System.out.println("Openning File " + fileName);
		return null;
	}
}
