package com.citibank.main.domain;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	public MyFileReader(File file, Reader reader) {
		
		super();
		this.file = file;
		this.reader = reader;
		System.out.println("my file reader constructor");
	}
	
	public String readFile()
	{
		try {
			length = (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile;
		} catch (IOException e) 
		{
			System.out.println("error while reading file");
			return "Error while reading";
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("error while closing");
			}
		}
		
	}
	
}
