
public class array_3_multidimensional {
	public static void main(String[] args) {
		
		int [][]flats=new int[2][3];
		flats[0][0]=00;
		flats[0][1]=98;
		flats[0][2]=98;
		flats[1][0]=98;
		flats[1][1]=98;
		flats[1][2]=00;
		
		for(int i=0;i<flats.length;i++)
		{
			for(int j=0;j<flats[i].length;j++)
			{
				System.out.print(flats[i][j]);
				System.out.print("        ");
			}
			System.out.println(" ");
		}
	}
}
