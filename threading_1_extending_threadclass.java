/*
class fun extends Thread
{
	public void run()     //override method
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println("Hello");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Big Exception");
		}
	}
}

public class threading_1_extending_threadclass {

	public static void main(String[] args) throws InterruptedException  {
		fun f=new fun();
		f.start();	 //operating the run method----internally running
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("hey");
			Thread.sleep(1000);
		}
	}		
} 

// output comes in 5 sec
*/

//===========================================================================================================


class fun extends Thread
{
	public void fun()     // Normal method
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println("Hello");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Big Exception");
		}
	}
}

public class threading_1_extending_threadclass {

	public static void main(String[] args) throws InterruptedException  {
		fun f=new fun();
		f.fun();	 //operating slowly .... because it runs 1st class method
		                                             //after that runs main method.                          
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("hey");
			Thread.sleep(1000);
		}
	}		
}

// output comes in 10 sec