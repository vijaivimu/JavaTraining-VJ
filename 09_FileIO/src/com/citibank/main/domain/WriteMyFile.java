package com.citibank.main.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMyFile {
	private File file;
	private OutputStream outputStream;
	private String outMessage;
	
	public WriteMyFile(OutputStream outputStream, String outMessage) {
		super();
		this.outputStream = outputStream;
		this.outMessage = outMessage;
	}
	
	public boolean writeFile()
	{
		try {
			outputStream.write(outMessage.getBytes());
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error while writing");
			return false;
		}
		finally
		{
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Error when closing");
			}
		}
	}
	

}
