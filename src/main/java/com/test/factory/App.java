package com.test.factory;

public class App {

	public static void main(String[] args) {
		BatchProcessor batchProcess = null;
		if("TEXT".equals(args[1])) {
			batchProcess = new TextBatchProcessor();
		} else if ("CSV".equals(args[1])) {
			batchProcess = new CSVBatchProcessor();
		} else if ("XML".equals(args[1])) {
			batchProcess = new XMLBatchProcessor();
		} else if ("XLS".equals(args[1])) {
			batchProcess = new ExcelBatchProcessor();
		}
		batchProcess.processBatch(args[0]);
		System.out.println("Done....");
	}

}
