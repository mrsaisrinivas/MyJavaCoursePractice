class  M extends Thread
{
	@Override
	public  void run()    
	{
		for (int i = 1; i <=100; i++)
		{
			System.out.println(getName()+ ":"+ i);

			/// getName is a method.
			// by this method, we will get the name of the thread.
		}
		
	}
}
class N
	{
	public static void main(String[] args)
	{
		M m1 = new M();
		m1.run();
	 
		for (int i= 101; i<= 200; i++ )
		{
			System.out.println(Thread.currentThread().getName()+ ":"+ i);
		}
	}
}
		//Thread.current Thread is also the method.
