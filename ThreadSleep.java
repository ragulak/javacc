package Phase2assisted;


	public class ThreadSleep 
	{
	    private static Object oc = new Object(); //creating object of OBJECT class
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(1000);//sleep method belongs to Thread class
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
	        synchronized (oc) 
	        {
	            oc.wait(1000); //wait method belongs to Object class
	            System.out.println("Object '" + oc + "' is woken after" + " waiting for 1 second");
	        }
	    }
	}


