class V
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());

		t1.setPriority(10);
		System.out.println(t1.getPriority());
	}
	
}
//Main Thread will have 05.
//Priority can be changed to 10
