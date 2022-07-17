interface computer
{
	void speaker();
	void fullhddisplay();
}
interface mobilephone extends computer
{
	void ram();
	void storage();
}

class specification implements mobilephone
{
	public void speaker()
	{
		System.out.println("loud Speakers");
	}
	public void fullhddisplay()
	{
		System.out.println("Oled display");
	}
	public void ram()
	{
		System.out.println("12gb Ram");
	}
	public void storage()
	{
		System.out.println("256gb Storage");
	}
}
public class interface_inherite_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobilephone t=new specification();
		t.storage();
	}

}
