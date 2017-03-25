/*
 * Class Logger
 * used to log messages on standard output 
 * with every occurence of specified events
 */
package primeThreads.util;

public class Logger{


    public static enum DebugLevel { CONSTRUCTOR ,RUN ,ADDTORESULT ,PRINTVECTOR , 
    	NOOUTPUT };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) 
    {
    	switch (levelIn) 
    	{
    	case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
    	case 3: debugLevel =DebugLevel.RUN; break;
    	case 2: debugLevel=DebugLevel.ADDTORESULT; break;
    	case 1: debugLevel=DebugLevel.PRINTVECTOR; break;
    	case 0: debugLevel=DebugLevel.NOOUTPUT; break;
    	}
    }
    

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
