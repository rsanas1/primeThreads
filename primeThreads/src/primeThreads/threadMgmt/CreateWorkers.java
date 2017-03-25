/*
 * CreateWorkers Class
 * This class creates multiple WorkerThread threads
 */
package primeThreads.threadMgmt;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class CreateWorkers
{
	FileProcessor fp;
	Results res;
	IsPrime ip;
	public CreateWorkers(FileProcessor fpIn,Results resIn,IsPrime ipIn)
	{
		
		Logger.writeMessage("CreateWorkers Constructor called", DebugLevel.CONSTRUCTOR);
		fp=fpIn;
		res=resIn;
		ip=ipIn;
				
	}
	public void startWorkers(int num)
	{
		Thread wThreads[] = new Thread[num];
		for (int j = 0; j < num; j++) 
		{
		    try {
		    	wThreads[j] = new Thread(new WorkerThread(fp,res,ip));
			    wThreads[j].start();
				wThreads[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println(e.toString());
			}
		}
		
		//System.out.println("["+res.printVector()+"]");
	}
	

}