class cute1{
	int a;
	String str;
	float f;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	
	
}
public class getter_setter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cute1 c=new cute1();
		c.setA(88);
		c.setStr("Result");
		c.setF(89.6f);
		
		System.out.println(c.getA());
		System.out.println(c.getStr());
		System.out.println(c.getF());
	}

}
