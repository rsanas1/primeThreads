package primeThreads.util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import primeThreads.util.Logger.DebugLevel;
/**
 * FileProcessor--- class to open,read and close File. 
 * @author rishi sanas
 *
 */
public class FileProcessor {

	private String fileName;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private String lineRead;
	
	public FileProcessor(String filename)
	{
		/**
		 * Constructor for creating object for File Reader and Buffered Reader.
		 */
		Logger.writeMessage("FileProcessor Constructor called", DebugLevel.CONSTRUCTOR);
		this.fileName=filename;
		try {
			fileReader = new FileReader(fileName);
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println("File Not Found");
		}
		catch(Exception e)
		{
			closeStreams();
		}
		bufferedReader = 
                new BufferedReader(fileReader);
	}
	
	public synchronized String readLineFromFile()
	{
		/**
		 * Returns line fetched by the FileReader
		 */
		
		  try 
		  {
			if((lineRead = bufferedReader.readLine()) != null) 
			{
				//System.out.println(lineRead+"\n");
			     return lineRead;
			}
		  } 
		  catch (IOException e) 
		  {
			System.out.println(e.toString());
			
			
		  }
		  return null;   
	}
	
	public void closeStreams()
	{
		/**
		 * closing fileReader and bufferedReader streams.
		 */
		try 
		{
			bufferedReader.close();
			fileReader.close();
		} 
		catch (IOException e) 
		{
			System.err.println(e.toString());
		}
		
	}

	
	public String toString() 
	{
		return (fileName);
	}
	
	
	
}
