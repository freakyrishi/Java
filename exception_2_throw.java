
public class exception_2_throw {

	public static void main(String[] args) throws InterruptedException  
	{   //exception JVM handle kar rha hai
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(100);
		}
	}

}
