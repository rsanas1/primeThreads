
package primeThreads.store;

import java.util.Vector;

import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class Results implements StdoutDisplayInterface {
    // appropriate data structure as private data member

	 private static Vector<Integer> v = new Vector<Integer>(0, 2);
    // appropriate method to save prime number to the data structure

	 public void add(int num)
	 {
		 Logger.writeMessage(num+" added to Result datastructure", DebugLevel.ADDTORESULT);
		 v.add(num);
	 }

	@Override
	public void writeSumToScreen() 
	{
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<v.size();i++)
		{
			sum+=v.get(i);
		}
		
		System.out.println("The sum of all the prime numbers is :"+sum);
	}
	
	public String printVector()
	{
		
		return v.toString();
	}
    
} 


