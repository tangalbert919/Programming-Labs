package main;

import java.io.*;	// Input/Output package required for file handling


/**
 * The ExpoInFile class handles data file for input.
 * Data files are limited to text files and only strings are
 * transferred from external hard drive files to internal file objects.
 **/
public class ExpoInFile
{
	
	private String fileName;
	private BufferedReader inFile;

	
	/**
	 * ExpoInFile constructor method.
	 * Associates external file name with internal file object.
	 * Constructs file object for reading in string values from external file.
	 **/
	public ExpoInFile(String s) throws IOException
	{
		fileName = s;
		inFile = new BufferedReader(new FileReader(fileName));
	}

	
	/**
	 * Returns a single string from external file to internal file object.	
	 **/
	public String readString() throws IOException
	{ 
		String inString = inFile.readLine();
		return inString; 
	}

	
	/**
	 * Closes file object.
	 **/
	public void closeFile() throws IOException
	{
		inFile.close();
	}
		
}

