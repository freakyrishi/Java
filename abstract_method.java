abstract class Human{
	void humannature()
	{
		System.out.println("Human lives on earth");
	}
	abstract public void activity();  //abstract ka method banana hi padega
	
}
class rahul extends Human{
	 public void activity() {
		System.out.println("Rahul can dance");
	}
}
class rohit extends Human{
	 public void activity() {
		System.out.println("rohit can dance");
	}
}

public class abstract_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rahul r1=new rahul();
		r1.activity();
		rohit r2=new rohit();
		r2.activity();
		r2.humannature();
	}

}
