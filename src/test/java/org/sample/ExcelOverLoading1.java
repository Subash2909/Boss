package org.sample;

import java.io.IOException;

public class ExcelOverLoading1 {
	public static void main(String[] args) throws IOException {
		ExcelOverLoading result=new ExcelOverLoading();
		String data = result.getData(1, 2);
		System.out.println(data);
	}

}
