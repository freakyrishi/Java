
public class array_1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int [] dish= {88,56,93,10,6,2,1};
		
		for (int i=dish.length-1;i>=0;i--)
		{
			System.out.println(dish[i]);
		}
		System.out.println("----------------------------------------------------------");
		
		for(int element: dish)
		{
			System.out.println(element);
		}
	}	
	
	}