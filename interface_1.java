import java.util.Scanner;

interface client {
	void input();
	void output();
	
}
class developer implements client{
	String name;
	int salary;
	
	public void input()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		
		System.out.println("Salary");
		salary=sc.nextInt();
	}
	
	public void output()
	{
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
}


public class interface_1 {

	public static void main(String[] args) {
		client c=new developer();
		c.input();
		c.output();
	}

}




