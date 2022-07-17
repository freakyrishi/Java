import java.util.Scanner;
public class helloworld {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		if(ch%100!=0 && ch%4==0)
		{
			System.out.println("Leap Year");
		}
		else {
			
			System.out.println("Not Leap Year");	
		}
		
	
	}
	
}

