package com.citibank.main;

import com.citibank.main.domain.MyFileMetaData;
import com.citibank.main.domain.ReadMyFile;

public class MyFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileMetaData myFileMetaData = new MyFileMetaData();
		myFileMetaData.printFileMetaData();
		ReadMyFile readMyFile = new ReadMyFile();
		readMyFile.readFile();
		

	}

}
