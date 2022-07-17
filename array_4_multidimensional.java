
public class array_4_multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]=new String [3][3];
		
		str[0][0]="a";
		str[0][1]="b";
		str[0][2]="c";
		str[1][0]="d";
		str[1][1]="e";
		str[1][2]="f";
		str[2][0]="g";
		str[2][1]="h";
		str[2][2]="i";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
