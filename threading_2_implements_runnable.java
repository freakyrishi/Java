class mouse implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Good morning !");
			
		}
	}
}
public class threading_2_implements_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mouse m=new mouse();
		Thread t=new Thread(m);
		
		t.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Night !");
			
			
		}
	}

}
