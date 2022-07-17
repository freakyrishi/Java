
public class method_overloading {
	void ff(int a) {
		System.out.println(a);
	}
	void ff(int a, int b) {
		
		System.out.println(a+b);
	}
	void ff(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 method_overloading o=new method_overloading();
		 o.ff(63);
		 o.ff(63,1);
		 o.ff(63,1,1);
	}

}
