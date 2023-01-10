class  F implements Runnable  //Runnable is a interphase
{

	public void run()
	{
		for (int i = 1; i <= 100 ; i++ )
		{
		System.out.println("first child: "+ i);
		}
		
	}
}
class G implements Runnable
{
	@Override
	public class void main(String[] args)
	{
		for (int i = 101; i<=200; i++)
		
		System.out.println("Hello World");
	}
}
class H 
{
	public class void main(String[] args)
	{
		F f1 = new F();
		Thread t1 = new Thread(f1);
		t1.start();      

		G g1 = new F();
		Thread t2 = new Thread(g1);
		t2.start();

		for (int i =201 ; <= 300; i++)
		{
			System.out.println("main thread: " + i ++);
		}


}

/* Functional Interphase:
Functional interphase will be consisting of single method.
Marker Interphase(Tagging Interpahse): in case of Maker Interphase, there will bnne
--no any members(does not have methods or concepts).
-> This is prallel output.

*/

