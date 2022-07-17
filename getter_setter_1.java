
public class getter_setter_1 {
int a;
int b;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			getter_setter_1 s=new getter_setter_1();
			s.getA();
			s.setA(56);
			s.getB();
			s.setB(81);
			System.out.println(s.getB());
			System.out.println(s.getA());
	}

}
