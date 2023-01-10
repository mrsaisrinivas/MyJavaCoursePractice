class C extends Thread
{
	@Override            // with overried we can run Thread class.
	public void run()   // run is a method, we need to keep the -
					   //the task in the run method
	{
		for ((int i = 1; i<= 100; i++ )
		{
			System.out.println("first thread: " + i);
		}
}
}
class D extends Thread 
{

	@Override 
	public void run()    // run is a method
					
	{
		for (int i = 101; i<= 200; i++ )
		{
			System.out.println("second thread: " + i);
		}
}
}
class E
{

	public static void main(String[] args) 
	{
		C c1 = new C();        //  Main thread is creating child thread,C and D 
		c1.start();  //---we are calling start method. 
		
		                // while creating object to c class, 
	                    //thread will be created.
						//start is a method.
						// internally start method is calling the run method.
						// in other words, internally it is calleing C class
						// it is going to allocate some cpu time for this thread.

        
		
		D d1 = new D(); 
		d1.start();  
						
								
		for (int i = 201; <= 300; i++ )
		{
			System.out.println("main thread");
	
								//start is a method.

							// internally start method is calling the run method.
							// in other words, internally it is calleing C class

							// it is going to allocate some cpu time for this thread.
		
		// it is going to registered

//first main method is created by defalt
//start method will call run method.
		
	}
}
}

/*

How we can create a thread in java excplictly.
By fault JVM will create the Main Thread.
There are two ways of creating thread in java.
1)First approach is by extending thread class
2)Second approach is by implenting runable interphase.
New Concept: 
Thread sheeding: , Thread sheeting is what ever new threads are created
--users should be registred with thread shceduler.
Thread scheduler: It is taking time to scheduling processor time--
to all the registered threads.







*/
