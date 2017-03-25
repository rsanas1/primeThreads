/*
 * ClassName: Driver
 * Controller Class of this project
 * Stores filename,number of threads,Debug Value
 * creates instance of Results Class,IsPrime Class & File Processor Class
 * Set DebugLevel
 */
package primeThreads.driver;

import primeThreads.store.Results;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;


public class Driver{

	public static void main(String args[]) 
	{
		int NUM_THREADS=0;
		int DEBUG_VALUE=0;
		if(args.length!=3)
		{
			System.err.println("\n Invalid number of arguments");
			System.exit(1);
			
		}
		String input_file=args[0]; 
		FileProcessor fp=null;
		Results res=new Results(); 
		IsPrime prime=new IsPrime();
		CreateWorkers c=null;
		try
		{
			NUM_THREADS=Integer.parseInt(args[1]);
		    DEBUG_VALUE=Integer.parseInt(args[2]);
		}
		catch(Exception e)
		{
			System.err.println("Enter Numbers");
			System.exit(1);
		}
		
		Logger.setDebugValue(DEBUG_VALUE);
		
		
		if(!(NUM_THREADS>=1 && NUM_THREADS<=5))
		{
			System.err.println("\n Invalid number of threads entered (1-5)");
			System.exit(1);
		}
		if(!(DEBUG_VALUE>=0 && DEBUG_VALUE<=5))
		{
			System.err.println("\n Invalid DEBUG VALUE entered (0-4)");
			System.exit(1);
		}
		
		try 
		{
			fp = new FileProcessor(input_file);
		} 
		catch (Exception e) 
		{
			System.exit(1);
		}
		c=new CreateWorkers(fp, res, prime);
		c.startWorkers(NUM_THREADS);
		
		
		Logger.writeMessage(res.printVector(), DebugLevel.PRINTVECTOR);
		System.out.println("***********");
		res.writeSumToScreen();
		System.out.println("***********");
		


	} // end main(...)

} // end public class Driver

