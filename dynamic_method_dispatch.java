class code1{
	void name()
	{
		System.out.println("Hello Java");
	}
}

class code2 extends code1{
	
	void name()
	{
		System.out.println("Hello Python");
	}
}
public class dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//code1 gg=new code2();   // possible dynamic method dispatch 
		
		//code2 gg=new code1();  // Not possible dynamic method dispatch
		
		code1 g1=new code1();
		g1.name();
		
	}

}
