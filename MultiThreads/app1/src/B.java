class B 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 100; i++)   //for loop
		{
			System.out.println("loop1: " + i);
	    }
		for (int i = 101; i <= 200; i++)  // for loop
		{
			System.out.println("loop2: " + i);
		}
		for (int i = 201; i <= 300; i++)  // for loop
		{
			System.out.println("loop3: " + i);
		}
		
	}
}
/*
all the for loop are in sequence. 
Main thread is only involved in this execution.
*/
