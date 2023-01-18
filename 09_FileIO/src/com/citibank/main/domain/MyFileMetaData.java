package com.citibank.main.domain;

import java.io.File;
import java.sql.Date;

public class MyFileMetaData {
	private String path = "C:/Java_training/test.txt";
	
    public void printFileMetaData()
    {
    	File file= new File(path);
    	if(file.exists())
    	{
    		System.out.println("File Name ::" + file.getName());
    		System.out.println("File path ::" + file.getPath());
    		System.out.println("File size ::" + file.length());
    		System.out.println("File open ::" + file.canExecute());
    		System.out.println("File write ::" + file.canWrite());
    		System.out.println("File read ::" + file.canRead());
    		Date lastModifiedDate= new Date(file.lastModified());
    		System.out.println("last modified ::" + lastModifiedDate.toString());
    	}
    	else
    	{
    		System.out.println("file does not exist");
    		System.out.println("enter valid path");
    	}
    }
}
