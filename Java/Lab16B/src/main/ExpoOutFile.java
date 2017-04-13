package main;

import java.io.*;


/**
 * The ExpoOutFile class handles data file for output.
 * Data files are limited to text files and only strings are
 * transferred from internal file objects to external hard drive files.
 **/
public class ExpoOutFile
{
	
	private String fileName;
	private BufferedWriter outFile;
	
	
	/**
	 * ExpoOutFile constructor method.
	 * Associates external file name with internal file object.
	 * Constructs file object for writing out string values to an external file.
	 **/
	public ExpoOutFile(String s) throws IOException
	{
		fileName = s;
		outFile = new BufferedWriter(new FileWriter(fileName));
	}
	
	/**
	 * Writes a single string from internal file object to external hard drive file.	
	 **/
	public void writeString(String s) throws IOException
	{ 
		outFile.write(s); 
	}
	
	
	/**
	 * Writes a single string from internal file object to external hard drive file.
	 * Additionally a linefeed/carriage return is added.	
	 **/
	public void writelnString(String s) throws IOException
	{ 
		outFile.write(s); 
		outFile.newLine();
	}

	
	/**
	 * Closes file object.
	 **/
	public void closeFile() throws IOException
	{
		outFile.close();
	}
		
}

