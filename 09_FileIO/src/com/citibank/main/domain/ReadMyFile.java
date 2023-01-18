package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {

	private String path="C:/Java_training/test.txt";
	private InputStream inputStream;
	private byte[] data;
	int arrayLen;
	
	public void readFile()
	{
		try {
			File file = new File(path);
			

			arrayLen= (int) file.length();
			
			data = new byte[arrayLen];
			inputStream = new FileInputStream(path);
			inputStream.read(data);			
			System.out.println(data);
			
			for(byte b: data)
			{
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error reading ");
		}
		finally
		{
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Failed to close");
			}
		}
		
		
	}
	
}
