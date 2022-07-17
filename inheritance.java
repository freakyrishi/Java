class mode1{
	public mode1() {
		// TODO Auto-generated constructor stub
		System.out.println("More Beautiful");
	}
	mode1(int a)
	{
		System.out.println("The value of a= "+a);
	}
	mode1(int a,int b)
	{
		System.out.println("The value of ab= "+(a+b));
	}
}
class mode2 extends mode1{
	public mode2() {
		// TODO Auto-generated constructor stub
		super(6,3);
		System.out.println("Its Beautiful");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mode2 m = new mode2();
	}

}
