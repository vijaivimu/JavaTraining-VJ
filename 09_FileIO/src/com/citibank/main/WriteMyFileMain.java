package com.citibank.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class WriteMyFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		String outMessage;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file path");
		path= scanner.nextLine();
		System.out.println("Enter out message");		
		outMessage= scanner.nextLine();
		//File file = new File(path);
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
				
				
		WriteMyFile writeMyFile= new WriteMyFile(outputStream,outMessage);
		writeMyFile.writeFile();

	}

}
