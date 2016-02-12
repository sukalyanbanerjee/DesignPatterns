package com.test.factory;

import java.io.File;

public class ExcelBatchProcessor extends BatchProcessor {

	@Override
	public Parser createParser(File file) {
		return new ExcelParser(file);
	}

}
