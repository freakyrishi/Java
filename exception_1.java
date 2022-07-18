
public class exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		 }
		catch(Exception d)
		{
			System.out.println(d);
		}
	}

}
