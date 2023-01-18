package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class ReadFileReaderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file path");
		path= scanner.nextLine();
		File file = new File(path);
		Reader reader = null;
		try {
			reader = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("error while creating reader obj");
		}
		
		MyFileReader myFileReader = new MyFileReader(file,reader);
		System.out.println(myFileReader.readFile());		


	}

}
