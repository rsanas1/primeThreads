/*
 * Class WorkerThread
 * Read lines using FileProcessor instance, 
 * checks of its prime using IsPrime instance
 * and adds it to DataStructure
 * 
 */
package primeThreads.threadMgmt;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class WorkerThread implements Runnable  {

	FileProcessor fp;
	Results res;
	IsPrime ip;
	//private static int lineno;
		public WorkerThread(FileProcessor fpIn,Results resIn,IsPrime ipIn)
		{
			Logger.writeMessage("WorkerThread Constructor called", DebugLevel.CONSTRUCTOR);
		  	fp=fpIn;
		  	res=resIn;
		  	ip=ipIn;
		}

    public void run() 
    {
	// ...
    	Logger.writeMessage("In run method", DebugLevel.RUN);
    	String line;
    	while((line=fp.readLineFromFile())!=null)
    	{
    		int num=Integer.parseInt(line);
    		if(ip.checkPrime(num))
    		{
    		res.add(num);
    		}
    	}
    	
    	
    }
    

}