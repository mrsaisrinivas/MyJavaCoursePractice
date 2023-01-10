class R extends Thread 
{
	@Override
	public void run()
	{
	System.out.println(getName());
	System.out.println(isDaemon());// Daemon thread life depends on parent thread
	System.out.println(getId());
	System.out.println(getPriority());
	
	}
}
class S
{
public static void main(String[] args) 
	{

	R r1 = new R();
	r1.start();
}
		
	}

